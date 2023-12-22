package Windows.UI.Xaml.Navigation

import Windows.UI.Xaml.Navigation.IFrameNavigationOptionsFactory.ABI.IID
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FrameNavigationOptions.ABI::class)
@Signature("rc(Windows.UI.Xaml.Navigation.FrameNavigationOptions;{b539ad2a-9fb7-520a-8f41-57a50c59cf92})")
@WinRTByReference(brClass = FrameNavigationOptions.ByReference::class)
public open class FrameNavigationOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameNavigationOptions.WithDefault, IWinRTObject {
  private val __125480891_Interface: IFrameNavigationOptions.WithDefault by lazy {
    as_125480891()
  }


  public override val __125480891_Ptr: JNAPointer? by lazy {
    __125480891_Interface.__125480891_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__125480891_Interface)

  public constructor() : this(ABI.activate())

  private fun as_125480891(): IFrameNavigationOptions.WithDefault {
    if(pointer == NULL) {
      return(IFrameNavigationOptions.ABI.makeIFrameNavigationOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameNavigationOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameNavigationOptions.ABI.makeIFrameNavigationOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameNavigationOptions> {
    public override fun getValue() = FrameNavigationOptions(pointer.getPointer(0))

    public fun setValue(value: FrameNavigationOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameNavigationOptions, MemoryAddress> {
    public val IFrameNavigationOptionsFactory_Instance: IFrameNavigationOptionsFactory by lazy {
      createIFrameNavigationOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFrameNavigationOptionsFactory(): IFrameNavigationOptionsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Navigation.FrameNavigationOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFrameNavigationOptionsFactory.ABI.makeIFrameNavigationOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IFrameNavigationOptionsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FrameNavigationOptions {
      val address = segment.toRawLongValue()
      return FrameNavigationOptions(Pointer(address))
    }

    public override fun toNative(obj: FrameNavigationOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
