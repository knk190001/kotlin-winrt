package Windows.Media.Protection.PlayReady

import Windows.Foundation.Uri
import Windows.Media.Protection.PlayReady.IPlayReadyContentHeaderFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Byte
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PlayReadyContentHeader.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadyContentHeader;{9a438a6a-7f4c-452e-88bd-0148c6387a2c})")
@WinRTByReference(brClass = PlayReadyContentHeader.ByReference::class)
public class PlayReadyContentHeader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayReadyContentHeader.WithDefault, IPlayReadyContentHeader2.WithDefault,
    IWinRTObject {
  private val __640216145_Interface: IPlayReadyContentHeader.WithDefault by lazy {
    as_640216145()
  }


  private val __1628135935_Interface: IPlayReadyContentHeader2.WithDefault by lazy {
    as_1628135935()
  }


  public override val __640216145_Ptr: JNAPointer? by lazy {
    __640216145_Interface.__640216145_Ptr
  }


  public override val __1628135935_Ptr: JNAPointer? by lazy {
    __1628135935_Interface.__1628135935_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__640216145_Interface, __1628135935_Interface)

  public constructor(
    headerBytes: Array<Byte>,
    licenseAcquisitionUrl: Uri,
    licenseAcquisitionUserInterfaceUrl: Uri,
    customAttributes: String,
    domainServiceId: Guid.GUID
  ) : this(ABI.activate(headerBytes, licenseAcquisitionUrl, licenseAcquisitionUserInterfaceUrl,
      customAttributes, domainServiceId))

  public constructor(
    contentKeyId: Guid.GUID,
    contentKeyIdString: String,
    contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm,
    licenseAcquisitionUrl: Uri,
    licenseAcquisitionUserInterfaceUrl: Uri,
    customAttributes: String,
    domainServiceId: Guid.GUID
  ) : this(ABI.activate(contentKeyId, contentKeyIdString, contentEncryptionAlgorithm,
      licenseAcquisitionUrl, licenseAcquisitionUserInterfaceUrl, customAttributes, domainServiceId))

  public constructor(headerBytes: Array<Byte>) : this(ABI.activate(headerBytes))

  public constructor(
    dwFlags: WinDef.UINT,
    contentKeyIds: Array<Guid.GUID?>,
    contentKeyIdStrings: Array<String?>,
    contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm,
    licenseAcquisitionUrl: Uri,
    licenseAcquisitionUserInterfaceUrl: Uri,
    customAttributes: String,
    domainServiceId: Guid.GUID
  ) : this(ABI.activate(dwFlags, contentKeyIds, contentKeyIdStrings, contentEncryptionAlgorithm,
      licenseAcquisitionUrl, licenseAcquisitionUserInterfaceUrl, customAttributes, domainServiceId))

  private fun as_640216145(): IPlayReadyContentHeader.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyContentHeader.ABI.makeIPlayReadyContentHeader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyContentHeader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyContentHeader.ABI.makeIPlayReadyContentHeader(ref.value))
  }

  private fun as_1628135935(): IPlayReadyContentHeader2.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyContentHeader2.ABI.makeIPlayReadyContentHeader2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyContentHeader2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyContentHeader2.ABI.makeIPlayReadyContentHeader2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadyContentHeader> {
    public override fun getValue() = PlayReadyContentHeader(pointer.getPointer(0))

    public fun setValue(value: PlayReadyContentHeader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyContentHeader, MemoryAddress> {
    public val IPlayReadyContentHeaderFactory_Instance: IPlayReadyContentHeaderFactory by lazy {
      createIPlayReadyContentHeaderFactory()
    }


    public val IPlayReadyContentHeaderFactory2_Instance: IPlayReadyContentHeaderFactory2 by lazy {
      createIPlayReadyContentHeaderFactory2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlayReadyContentHeaderFactory(): IPlayReadyContentHeaderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyContentHeader".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPlayReadyContentHeaderFactory.ABI.makeIPlayReadyContentHeaderFactory(factoryActivatorPtr.value))
    }

    public fun createIPlayReadyContentHeaderFactory2(): IPlayReadyContentHeaderFactory2 {
      val refiid = Guid.REFIID(IPlayReadyContentHeaderFactory2.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyContentHeader".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPlayReadyContentHeaderFactory2.ABI.makeIPlayReadyContentHeaderFactory2(factoryActivatorPtr.value))
    }

    public fun activate(
      headerBytes: Array<Byte>,
      licenseAcquisitionUrl: Uri,
      licenseAcquisitionUserInterfaceUrl: Uri,
      customAttributes: String,
      domainServiceId: Guid.GUID
    ): JNAPointer? =
        IPlayReadyContentHeaderFactory_Instance.CreateInstanceFromWindowsMediaDrmHeader(headerBytes,
        licenseAcquisitionUrl, licenseAcquisitionUserInterfaceUrl, customAttributes,
        domainServiceId)?.pointer

    public fun activate(
      contentKeyId: Guid.GUID,
      contentKeyIdString: String,
      contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm,
      licenseAcquisitionUrl: Uri,
      licenseAcquisitionUserInterfaceUrl: Uri,
      customAttributes: String,
      domainServiceId: Guid.GUID
    ): JNAPointer? =
        IPlayReadyContentHeaderFactory_Instance.CreateInstanceFromComponents(contentKeyId,
        contentKeyIdString, contentEncryptionAlgorithm, licenseAcquisitionUrl,
        licenseAcquisitionUserInterfaceUrl, customAttributes, domainServiceId)?.pointer

    public fun activate(headerBytes: Array<Byte>): JNAPointer? =
        IPlayReadyContentHeaderFactory_Instance.CreateInstanceFromPlayReadyHeader(headerBytes)?.pointer

    public fun activate(
      dwFlags: WinDef.UINT,
      contentKeyIds: Array<Guid.GUID?>,
      contentKeyIdStrings: Array<String?>,
      contentEncryptionAlgorithm: PlayReadyEncryptionAlgorithm,
      licenseAcquisitionUrl: Uri,
      licenseAcquisitionUserInterfaceUrl: Uri,
      customAttributes: String,
      domainServiceId: Guid.GUID
    ): JNAPointer? = IPlayReadyContentHeaderFactory2_Instance.CreateInstanceFromComponents2(dwFlags,
        contentKeyIds, contentKeyIdStrings, contentEncryptionAlgorithm, licenseAcquisitionUrl,
        licenseAcquisitionUserInterfaceUrl, customAttributes, domainServiceId)?.pointer

    public override fun fromNative(segment: MemoryAddress): PlayReadyContentHeader {
      val address = segment.toRawLongValue()
      return PlayReadyContentHeader(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyContentHeader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
