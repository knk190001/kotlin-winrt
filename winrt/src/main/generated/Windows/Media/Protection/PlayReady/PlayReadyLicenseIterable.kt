package Windows.Media.Protection.PlayReady

import Windows.Foundation.Collections.IIterable
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(PlayReadyLicenseIterable.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadyLicenseIterable;pinterface({faa585ea-6214-4217-afda-7f46de5869b3};{ee474c4e-fa3c-414d-a9f2-3ffc1ef832d4}))")
@WinRTByReference(brClass = PlayReadyLicenseIterable.ByReference::class)
public class PlayReadyLicenseIterable(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIterable<IPlayReadyLicense?>, IWinRTObject {
  private val __1449643190_Interface: IIterable<IPlayReadyLicense?> by lazy {
    as_1449643190()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<IPlayReadyLicense?>>()

  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1449643190_Interface)

  public constructor() : this(ABI.activate())

  public constructor(contentHeader: PlayReadyContentHeader, fullyEvaluated: Boolean) :
      this(ABI.activate(contentHeader, fullyEvaluated))

  private fun as_1449643190(): IIterable<IPlayReadyLicense?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IPlayReadyLicense?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IPlayReadyLicense?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IPlayReadyLicense?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadyLicenseIterable> {
    public override fun getValue() = PlayReadyLicenseIterable(pointer.getPointer(0))

    public fun setValue(value: PlayReadyLicenseIterable): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyLicenseIterable, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPlayReadyLicenseIterableFactory_Instance: IPlayReadyLicenseIterableFactory by lazy {
      createIPlayReadyLicenseIterableFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyLicenseIterable".toHandle(),
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

    public fun createIPlayReadyLicenseIterableFactory(): IPlayReadyLicenseIterableFactory {
      val refiid = Guid.REFIID(IPlayReadyLicenseIterableFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyLicenseIterable".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPlayReadyLicenseIterableFactory.ABI.makeIPlayReadyLicenseIterableFactory(factoryActivatorPtr.value))
    }

    public fun activate(contentHeader: PlayReadyContentHeader, fullyEvaluated: Boolean): JNAPointer?
        = IPlayReadyLicenseIterableFactory_Instance.CreateInstance(contentHeader,
        fullyEvaluated)?.pointer

    public override fun fromNative(segment: MemoryAddress): PlayReadyLicenseIterable {
      val address = segment.toRawLongValue()
      return PlayReadyLicenseIterable(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyLicenseIterable): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
