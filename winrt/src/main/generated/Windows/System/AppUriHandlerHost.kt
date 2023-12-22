package Windows.System

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppUriHandlerHost.ABI::class)
@Signature("rc(Windows.System.AppUriHandlerHost;{5d50cac5-92d2-5409-b56f-7f73e10ea4c3})")
@WinRTByReference(brClass = AppUriHandlerHost.ByReference::class)
public class AppUriHandlerHost(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppUriHandlerHost.WithDefault, IAppUriHandlerHost2.WithDefault, IWinRTObject
    {
  private val __1852493816_Interface: IAppUriHandlerHost.WithDefault by lazy {
    as_1852493816()
  }


  private val __1592733498_Interface: IAppUriHandlerHost2.WithDefault by lazy {
    as_1592733498()
  }


  public override val __1852493816_Ptr: JNAPointer? by lazy {
    __1852493816_Interface.__1852493816_Ptr
  }


  public override val __1592733498_Ptr: JNAPointer? by lazy {
    __1592733498_Interface.__1592733498_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1852493816_Interface, __1592733498_Interface)

  public constructor() : this(ABI.activate())

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_1852493816(): IAppUriHandlerHost.WithDefault {
    if(pointer == NULL) {
      return(IAppUriHandlerHost.ABI.makeIAppUriHandlerHost(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppUriHandlerHost>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppUriHandlerHost.ABI.makeIAppUriHandlerHost(ref.value))
  }

  private fun as_1592733498(): IAppUriHandlerHost2.WithDefault {
    if(pointer == NULL) {
      return(IAppUriHandlerHost2.ABI.makeIAppUriHandlerHost2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppUriHandlerHost2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppUriHandlerHost2.ABI.makeIAppUriHandlerHost2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppUriHandlerHost> {
    public override fun getValue() = AppUriHandlerHost(pointer.getPointer(0))

    public fun setValue(value: AppUriHandlerHost): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppUriHandlerHost, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAppUriHandlerHostFactory_Instance: IAppUriHandlerHostFactory by lazy {
      createIAppUriHandlerHostFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.System.AppUriHandlerHost".toHandle(),
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

    public fun createIAppUriHandlerHostFactory(): IAppUriHandlerHostFactory {
      val refiid = Guid.REFIID(IAppUriHandlerHostFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.AppUriHandlerHost".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppUriHandlerHostFactory.ABI.makeIAppUriHandlerHostFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IAppUriHandlerHostFactory_Instance.CreateInstance(name)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppUriHandlerHost {
      val address = segment.toRawLongValue()
      return AppUriHandlerHost(Pointer(address))
    }

    public override fun toNative(obj: AppUriHandlerHost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
