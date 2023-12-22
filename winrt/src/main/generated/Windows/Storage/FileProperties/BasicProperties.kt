package Windows.Storage.FileProperties

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

@ABIMarker(BasicProperties.ABI::class)
@Signature("rc(Windows.Storage.FileProperties.BasicProperties;{d05d55db-785e-4a66-be02-9beec58aea81})")
@WinRTByReference(brClass = BasicProperties.ByReference::class)
public class BasicProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBasicProperties.WithDefault, IStorageItemExtraProperties.WithDefault,
    IWinRTObject {
  private val __100977221_Interface: IBasicProperties.WithDefault by lazy {
    as_100977221()
  }


  private val __1999536785_Interface: IStorageItemExtraProperties.WithDefault by lazy {
    as_1999536785()
  }


  public override val __100977221_Ptr: JNAPointer? by lazy {
    __100977221_Interface.__100977221_Ptr
  }


  public override val __1999536785_Ptr: JNAPointer? by lazy {
    __1999536785_Interface.__1999536785_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__100977221_Interface, __1999536785_Interface)

  private fun as_100977221(): IBasicProperties.WithDefault {
    if(pointer == NULL) {
      return(IBasicProperties.ABI.makeIBasicProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBasicProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBasicProperties.ABI.makeIBasicProperties(ref.value))
  }

  private fun as_1999536785(): IStorageItemExtraProperties.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemExtraProperties.ABI.makeIStorageItemExtraProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemExtraProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemExtraProperties.ABI.makeIStorageItemExtraProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BasicProperties> {
    public override fun getValue() = BasicProperties(pointer.getPointer(0))

    public fun setValue(value: BasicProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BasicProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BasicProperties {
      val address = segment.toRawLongValue()
      return BasicProperties(Pointer(address))
    }

    public override fun toNative(obj: BasicProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
