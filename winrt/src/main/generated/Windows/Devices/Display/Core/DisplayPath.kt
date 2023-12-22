package Windows.Devices.Display.Core

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

@ABIMarker(DisplayPath.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayPath;{b3dfd64a-7460-5cde-811b-d5ae9f3d9f84})")
@WinRTByReference(brClass = DisplayPath.ByReference::class)
public class DisplayPath(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayPath.WithDefault, IDisplayPath2.WithDefault, IWinRTObject {
  private val __620073147_Interface: IDisplayPath.WithDefault by lazy {
    as_620073147()
  }


  private val __2042398323_Interface: IDisplayPath2.WithDefault by lazy {
    as_2042398323()
  }


  public override val __620073147_Ptr: JNAPointer? by lazy {
    __620073147_Interface.__620073147_Ptr
  }


  public override val __2042398323_Ptr: JNAPointer? by lazy {
    __2042398323_Interface.__2042398323_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__620073147_Interface, __2042398323_Interface)

  private fun as_620073147(): IDisplayPath.WithDefault {
    if(pointer == NULL) {
      return(IDisplayPath.ABI.makeIDisplayPath(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayPath>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayPath.ABI.makeIDisplayPath(ref.value))
  }

  private fun as_2042398323(): IDisplayPath2.WithDefault {
    if(pointer == NULL) {
      return(IDisplayPath2.ABI.makeIDisplayPath2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayPath2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayPath2.ABI.makeIDisplayPath2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayPath> {
    public override fun getValue() = DisplayPath(pointer.getPointer(0))

    public fun setValue(value: DisplayPath): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayPath, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayPath {
      val address = segment.toRawLongValue()
      return DisplayPath(Pointer(address))
    }

    public override fun toNative(obj: DisplayPath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
