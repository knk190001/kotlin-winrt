package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.Media.IThemeShadowFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ThemeShadow.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.ThemeShadow;{c264208a-d1f4-58ae-8a88-fc59148bee69})")
@WinRTByReference(brClass = ThemeShadow.ByReference::class)
public open class ThemeShadow(
  ptr: JNAPointer? = NULL
) : Shadow(ptr), IThemeShadow.WithDefault, IWinRTObject {
  private val __2137608056_Interface: IThemeShadow.WithDefault by lazy {
    as_2137608056()
  }


  public override val __2137608056_Ptr: JNAPointer? by lazy {
    __2137608056_Interface.__2137608056_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2137608056_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2137608056(): IThemeShadow.WithDefault {
    if(pointer == NULL) {
      return(IThemeShadow.ABI.makeIThemeShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IThemeShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IThemeShadow.ABI.makeIThemeShadow(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ThemeShadow> {
    public override fun getValue() = ThemeShadow(pointer.getPointer(0))

    public fun setValue(value: ThemeShadow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ThemeShadow, MemoryAddress> {
    public val IThemeShadowFactory_Instance: IThemeShadowFactory by lazy {
      createIThemeShadowFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIThemeShadowFactory(): IThemeShadowFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.ThemeShadow".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IThemeShadowFactory.ABI.makeIThemeShadowFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IThemeShadowFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ThemeShadow {
      val address = segment.toRawLongValue()
      return ThemeShadow(Pointer(address))
    }

    public override fun toNative(obj: ThemeShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
