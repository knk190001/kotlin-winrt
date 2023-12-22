package Windows.ApplicationModel.Resources.Core

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NamedResource.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Core.NamedResource;{1c98c219-0b13-4240-89a5-d495dc189a00})")
@WinRTByReference(brClass = NamedResource.ByReference::class)
public class NamedResource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INamedResource.WithDefault, IWinRTObject {
  private val __1680668240_Interface: INamedResource.WithDefault by lazy {
    as_1680668240()
  }


  public override val __1680668240_Ptr: JNAPointer? by lazy {
    __1680668240_Interface.__1680668240_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1680668240_Interface)

  private fun as_1680668240(): INamedResource.WithDefault {
    if(pointer == NULL) {
      return(INamedResource.ABI.makeINamedResource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INamedResource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INamedResource.ABI.makeINamedResource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NamedResource>
      {
    public override fun getValue() = NamedResource(pointer.getPointer(0))

    public fun setValue(value: NamedResource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NamedResource, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NamedResource {
      val address = segment.toRawLongValue()
      return NamedResource(Pointer(address))
    }

    public override fun toNative(obj: NamedResource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
