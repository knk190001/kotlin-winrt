package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IIterator
import Windows.Foundation.Collections.IKeyValuePair
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(ResourceMapIterator.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Core.ResourceMapIterator;pinterface({6a79e863-4300-459a-9966-cbb660963ee1};pinterface({02b51929-c1c4-4a7e-8940-0312b5c18500};string;rc(Windows.ApplicationModel.Resources.Core.NamedResource;{1c98c219-0b13-4240-89a5-d495dc189a00}))))")
@WinRTByReference(brClass = ResourceMapIterator.ByReference::class)
public class ResourceMapIterator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIterator<IKeyValuePair<String?, NamedResource?>?>, IWinRTObject {
  private val __1449660594_Interface: IIterator<IKeyValuePair<String?, NamedResource?>?> by lazy {
    as_1449660594()
  }


  public override val __1449660594_Type: KType = typeOf<IIterator<IKeyValuePair<String?,
      NamedResource?>?>>()

  public override val __1449660594_Ptr: JNAPointer? by lazy {
    __1449660594_Interface.__1449660594_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1449660594_Interface)

  private fun as_1449660594(): IIterator<IKeyValuePair<String?, NamedResource?>?> {
    if(pointer == NULL) {
      return(IIterator.ABI.makeIIterator<IKeyValuePair<String?, NamedResource?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterator<IKeyValuePair<String?, NamedResource?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterator.ABI.makeIIterator<IKeyValuePair<String?, NamedResource?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceMapIterator> {
    public override fun getValue() = ResourceMapIterator(pointer.getPointer(0))

    public fun setValue(value: ResourceMapIterator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceMapIterator, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResourceMapIterator {
      val address = segment.toRawLongValue()
      return ResourceMapIterator(Pointer(address))
    }

    public override fun toNative(obj: ResourceMapIterator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
