package Windows.ApplicationModel.Activation

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

@ABIMarker(SplashScreen.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.SplashScreen;{ca4d975c-d4d6-43f0-97c0-0833c6391c24})")
@WinRTByReference(brClass = SplashScreen.ByReference::class)
public class SplashScreen(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISplashScreen.WithDefault, IWinRTObject {
  private val __261685444_Interface: ISplashScreen.WithDefault by lazy {
    as_261685444()
  }


  public override val __261685444_Ptr: JNAPointer? by lazy {
    __261685444_Interface.__261685444_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__261685444_Interface)

  private fun as_261685444(): ISplashScreen.WithDefault {
    if(pointer == NULL) {
      return(ISplashScreen.ABI.makeISplashScreen(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplashScreen>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplashScreen.ABI.makeISplashScreen(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SplashScreen> {
    public override fun getValue() = SplashScreen(pointer.getPointer(0))

    public fun setValue(value: SplashScreen): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplashScreen, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SplashScreen {
      val address = segment.toRawLongValue()
      return SplashScreen(Pointer(address))
    }

    public override fun toNative(obj: SplashScreen): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
