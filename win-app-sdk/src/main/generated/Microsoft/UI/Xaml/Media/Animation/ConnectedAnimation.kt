package Microsoft.UI.Xaml.Media.Animation

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
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ConnectedAnimation;{a9c1c6ad-7670-589c-a608-9b5c01cec71f})")
@WinRTByReference(brClass = ConnectedAnimation.ByReference::class)
public class ConnectedAnimation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConnectedAnimation.WithDefault, IWinRTObject {
  private val __422733750_Interface: IConnectedAnimation.WithDefault by lazy {
    as_422733750()
  }


  public override val __422733750_Ptr: JNAPointer? by lazy {
    __422733750_Interface.__422733750_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__422733750_Interface)

  private fun as_422733750(): IConnectedAnimation.WithDefault {
    if(pointer == NULL) {
      return(IConnectedAnimation.ABI.makeIConnectedAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectedAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectedAnimation.ABI.makeIConnectedAnimation(ref.value))
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
