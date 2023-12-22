package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.PlayReady.INDLicenseFetchDescriptorFactory.ABI.IID
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
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NDLicenseFetchDescriptor.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.NDLicenseFetchDescriptor;{5498d33a-e686-4935-a567-7ca77ad20fa4})")
@WinRTByReference(brClass = NDLicenseFetchDescriptor.ByReference::class)
public class NDLicenseFetchDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INDLicenseFetchDescriptor.WithDefault, IWinRTObject {
  private val __986948488_Interface: INDLicenseFetchDescriptor.WithDefault by lazy {
    as_986948488()
  }


  public override val __986948488_Ptr: JNAPointer? by lazy {
    __986948488_Interface.__986948488_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__986948488_Interface)

  public constructor(
    contentIDType: NDContentIDType,
    contentIDBytes: Array<Byte>,
    licenseFetchChallengeCustomData: INDCustomData
  ) : this(ABI.activate(contentIDType, contentIDBytes, licenseFetchChallengeCustomData))

  private fun as_986948488(): INDLicenseFetchDescriptor.WithDefault {
    if(pointer == NULL) {
      return(INDLicenseFetchDescriptor.ABI.makeINDLicenseFetchDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INDLicenseFetchDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INDLicenseFetchDescriptor.ABI.makeINDLicenseFetchDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NDLicenseFetchDescriptor> {
    public override fun getValue() = NDLicenseFetchDescriptor(pointer.getPointer(0))

    public fun setValue(value: NDLicenseFetchDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NDLicenseFetchDescriptor, MemoryAddress> {
    public val INDLicenseFetchDescriptorFactory_Instance: INDLicenseFetchDescriptorFactory by lazy {
      createINDLicenseFetchDescriptorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINDLicenseFetchDescriptorFactory(): INDLicenseFetchDescriptorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.NDLicenseFetchDescriptor".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INDLicenseFetchDescriptorFactory.ABI.makeINDLicenseFetchDescriptorFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      contentIDType: NDContentIDType,
      contentIDBytes: Array<Byte>,
      licenseFetchChallengeCustomData: INDCustomData
    ): JNAPointer? = INDLicenseFetchDescriptorFactory_Instance.CreateInstance(contentIDType,
        contentIDBytes, licenseFetchChallengeCustomData)?.pointer

    public override fun fromNative(segment: MemoryAddress): NDLicenseFetchDescriptor {
      val address = segment.toRawLongValue()
      return NDLicenseFetchDescriptor(Pointer(address))
    }

    public override fun toNative(obj: NDLicenseFetchDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
