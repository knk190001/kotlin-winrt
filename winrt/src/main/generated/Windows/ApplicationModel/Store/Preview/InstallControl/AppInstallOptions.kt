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

@ABIMarker(AppInstallOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallOptions;{c9808300-1cb8-4eb6-8c9f-6a30c64a5b51})")
@WinRTByReference(brClass = AppInstallOptions.ByReference::class)
public class AppInstallOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInstallOptions.WithDefault, IAppInstallOptions2.WithDefault, IWinRTObject
    {
  private val __1275944486_Interface: IAppInstallOptions.WithDefault by lazy {
    as_1275944486()
  }


  private val __899573352_Interface: IAppInstallOptions2.WithDefault by lazy {
    as_899573352()
  }


  public override val __1275944486_Ptr: JNAPointer? by lazy {
    __1275944486_Interface.__1275944486_Ptr
  }


  public override val __899573352_Ptr: JNAPointer? by lazy {
    __899573352_Interface.__899573352_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1275944486_Interface, __899573352_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1275944486(): IAppInstallOptions.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallOptions.ABI.makeIAppInstallOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallOptions.ABI.makeIAppInstallOptions(ref.value))
  }

  private fun as_899573352(): IAppInstallOptions2.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallOptions2.ABI.makeIAppInstallOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallOptions2.ABI.makeIAppInstallOptions2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppInstallOptions> {
    public override fun getValue() = AppInstallOptions(pointer.getPointer(0))

    public fun setValue(value: AppInstallOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppInstallOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AppInstallOptions {
      val address = segment.toRawLongValue()
      return AppInstallOptions(Pointer(address))
    }

    public override fun toNative(obj: AppInstallOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
