package Windows.Services.Maps.LocalSearch

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

@ABIMarker(LocalLocation.ABI::class)
@Signature("rc(Windows.Services.Maps.LocalSearch.LocalLocation;{bb0fe9ab-4502-4f2c-94a9-0d60de0e2163})")
@WinRTByReference(brClass = LocalLocation.ByReference::class)
public class LocalLocation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILocalLocation.WithDefault, ILocalLocation2.WithDefault, IWinRTObject {
  private val __1786012792_Interface: ILocalLocation.WithDefault by lazy {
    as_1786012792()
  }


  private val __468178246_Interface: ILocalLocation2.WithDefault by lazy {
    as_468178246()
  }


  public override val __1786012792_Ptr: JNAPointer? by lazy {
    __1786012792_Interface.__1786012792_Ptr
  }


  public override val __468178246_Ptr: JNAPointer? by lazy {
    __468178246_Interface.__468178246_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1786012792_Interface, __468178246_Interface)

  private fun as_1786012792(): ILocalLocation.WithDefault {
    if(pointer == NULL) {
      return(ILocalLocation.ABI.makeILocalLocation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILocalLocation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILocalLocation.ABI.makeILocalLocation(ref.value))
  }

  private fun as_468178246(): ILocalLocation2.WithDefault {
    if(pointer == NULL) {
      return(ILocalLocation2.ABI.makeILocalLocation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILocalLocation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILocalLocation2.ABI.makeILocalLocation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LocalLocation>
      {
    public override fun getValue() = LocalLocation(pointer.getPointer(0))

    public fun setValue(value: LocalLocation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LocalLocation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LocalLocation {
      val address = segment.toRawLongValue()
      return LocalLocation(Pointer(address))
    }

    public override fun toNative(obj: LocalLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
