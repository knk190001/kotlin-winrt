package Windows.Media.Protection.PlayReady

import Windows.Foundation.Collections.IPropertySet
import Windows.Media.Protection.PlayReady.IPlayReadyLicenseSessionFactory.ABI.IID
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

@ABIMarker(PlayReadyLicenseSession.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadyLicenseSession;{a1723a39-87fa-4fdd-abbb-a9720e845259})")
@WinRTByReference(brClass = PlayReadyLicenseSession.ByReference::class)
public class PlayReadyLicenseSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayReadyLicenseSession.WithDefault, IPlayReadyLicenseSession2.WithDefault,
    IWinRTObject {
  private val __1756852086_Interface: IPlayReadyLicenseSession.WithDefault by lazy {
    as_1756852086()
  }


  private val __1372160232_Interface: IPlayReadyLicenseSession2.WithDefault by lazy {
    as_1372160232()
  }


  public override val __1756852086_Ptr: JNAPointer? by lazy {
    __1756852086_Interface.__1756852086_Ptr
  }


  public override val __1372160232_Ptr: JNAPointer? by lazy {
    __1372160232_Interface.__1372160232_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1756852086_Interface, __1372160232_Interface)

  public constructor(configuration: IPropertySet) : this(ABI.activate(configuration))

  private fun as_1756852086(): IPlayReadyLicenseSession.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyLicenseSession.ABI.makeIPlayReadyLicenseSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyLicenseSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyLicenseSession.ABI.makeIPlayReadyLicenseSession(ref.value))
  }

  private fun as_1372160232(): IPlayReadyLicenseSession2.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyLicenseSession2.ABI.makeIPlayReadyLicenseSession2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyLicenseSession2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyLicenseSession2.ABI.makeIPlayReadyLicenseSession2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadyLicenseSession> {
    public override fun getValue() = PlayReadyLicenseSession(pointer.getPointer(0))

    public fun setValue(value: PlayReadyLicenseSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyLicenseSession, MemoryAddress> {
    public val IPlayReadyLicenseSessionFactory_Instance: IPlayReadyLicenseSessionFactory by lazy {
      createIPlayReadyLicenseSessionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlayReadyLicenseSessionFactory(): IPlayReadyLicenseSessionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyLicenseSession".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPlayReadyLicenseSessionFactory.ABI.makeIPlayReadyLicenseSessionFactory(factoryActivatorPtr.value))
    }

    public fun activate(configuration: IPropertySet): JNAPointer? =
        IPlayReadyLicenseSessionFactory_Instance.CreateInstance(configuration)?.pointer

    public override fun fromNative(segment: MemoryAddress): PlayReadyLicenseSession {
      val address = segment.toRawLongValue()
      return PlayReadyLicenseSession(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyLicenseSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
