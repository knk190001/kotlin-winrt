package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ConnectedAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.ConnectedAnimation;{3518628c-f387-4c25-ac98-44e86c3cadf0})")
@WinRTByReference(brClass = ConnectedAnimation.ByReference::class)
public class ConnectedAnimation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConnectedAnimation.WithDefault, IConnectedAnimation2.WithDefault,
    IConnectedAnimation3.WithDefault, IWinRTObject {
  private val __1325387007_Interface: IConnectedAnimation.WithDefault by lazy {
    as_1325387007()
  }


  private val __1862675793_Interface: IConnectedAnimation2.WithDefault by lazy {
    as_1862675793()
  }


  private val __1862675794_Interface: IConnectedAnimation3.WithDefault by lazy {
    as_1862675794()
  }


  public override val __1325387007_Ptr: JNAPointer? by lazy {
    __1325387007_Interface.__1325387007_Ptr
  }


  public override val __1862675793_Ptr: JNAPointer? by lazy {
    __1862675793_Interface.__1862675793_Ptr
  }


  public override val __1862675794_Ptr: JNAPointer? by lazy {
    __1862675794_Interface.__1862675794_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1325387007_Interface, __1862675793_Interface, __1862675794_Interface)

  private fun as_1325387007(): IConnectedAnimation.WithDefault {
    if(pointer == NULL) {
      return(IConnectedAnimation.ABI.makeIConnectedAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectedAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectedAnimation.ABI.makeIConnectedAnimation(ref.value))
  }

  private fun as_1862675793(): IConnectedAnimation2.WithDefault {
    if(pointer == NULL) {
      return(IConnectedAnimation2.ABI.makeIConnectedAnimation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectedAnimation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectedAnimation2.ABI.makeIConnectedAnimation2(ref.value))
  }

  private fun as_1862675794(): IConnectedAnimation3.WithDefault {
    if(pointer == NULL) {
      return(IConnectedAnimation3.ABI.makeIConnectedAnimation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectedAnimation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectedAnimation3.ABI.makeIConnectedAnimation3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConnectedAnimation> {
    public override fun getValue() = ConnectedAnimation(pointer.getPointer(0))

    public fun setValue(value: ConnectedAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConnectedAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ConnectedAnimation {
      val address = segment.toRawLongValue()
      return ConnectedAnimation(Pointer(address))
    }

    public override fun toNative(obj: ConnectedAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
