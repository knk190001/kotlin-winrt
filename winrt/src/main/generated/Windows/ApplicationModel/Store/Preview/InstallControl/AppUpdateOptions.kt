package Windows.ApplicationModel.Store.Preview.InstallControl

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(AppUpdateOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.InstallControl.AppUpdateOptions;{26f0b02f-c2f3-4aea-af8c-6308dd9db85f})")
@WinRTByReference(brClass = AppUpdateOptions.ByReference::class)
public class AppUpdateOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppUpdateOptions.WithDefault, IAppUpdateOptions2.WithDefault, IWinRTObject {
  private val __719815330_Interface: IAppUpdateOptions.WithDefault by lazy {
    as_719815330()
  }


  private val __839438700_Interface: IAppUpdateOptions2.WithDefault by lazy {
    as_839438700()
  }


  public override val __719815330_Ptr: JNAPointer? by lazy {
    __719815330_Interface.__719815330_Ptr
  }


  public override val __839438700_Ptr: JNAPointer? by lazy {
    __839438700_Interface.__839438700_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__719815330_Interface, __839438700_Interface)

  public constructor() : this(ABI.activate())

  private fun as_719815330(): IAppUpdateOptions.WithDefault {
    if(pointer == NULL) {
      return(IAppUpdateOptions.ABI.makeIAppUpdateOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppUpdateOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppUpdateOptions.ABI.makeIAppUpdateOptions(ref.value))
  }

  private fun as_839438700(): IAppUpdateOptions2.WithDefault {
    if(pointer == NULL) {
      return(IAppUpdateOptions2.ABI.makeIAppUpdateOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppUpdateOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppUpdateOptions2.ABI.makeIAppUpdateOptions2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppUpdateOptions> {
    public override fun getValue() = AppUpdateOptions(pointer.getPointer(0))

    public fun setValue(value: AppUpdateOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppUpdateOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.InstallControl.AppUpdateOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): AppUpdateOptions {
      val address = segment.toRawLongValue()
      return AppUpdateOptions(Pointer(address))
    }

    public override fun toNative(obj: AppUpdateOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
