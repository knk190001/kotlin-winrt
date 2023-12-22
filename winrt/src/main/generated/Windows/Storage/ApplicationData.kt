package Windows.Storage

import Windows.Foundation.IClosable
import Windows.System.User
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ApplicationData.ABI::class)
@Signature("rc(Windows.Storage.ApplicationData;{c3da6fb7-b744-4b45-b0b8-223a0938d0dc})")
@WinRTByReference(brClass = ApplicationData.ByReference::class)
public class ApplicationData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplicationData.WithDefault, IApplicationData2.WithDefault,
    IApplicationData3.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __684544159_Interface: IApplicationData.WithDefault by lazy {
    as_684544159()
  }


  private val __253967601_Interface: IApplicationData2.WithDefault by lazy {
    as_253967601()
  }


  private val __253967602_Interface: IApplicationData3.WithDefault by lazy {
    as_253967602()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __684544159_Ptr: JNAPointer? by lazy {
    __684544159_Interface.__684544159_Ptr
  }


  public override val __253967601_Ptr: JNAPointer? by lazy {
    __253967601_Interface.__253967601_Ptr
  }


  public override val __253967602_Ptr: JNAPointer? by lazy {
    __253967602_Interface.__253967602_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__684544159_Interface, __253967601_Interface, __253967602_Interface,
        __1260617006_Interface)

  private fun as_684544159(): IApplicationData.WithDefault {
    if(pointer == NULL) {
      return(IApplicationData.ABI.makeIApplicationData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationData.ABI.makeIApplicationData(ref.value))
  }

  private fun as_253967601(): IApplicationData2.WithDefault {
    if(pointer == NULL) {
      return(IApplicationData2.ABI.makeIApplicationData2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationData2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationData2.ABI.makeIApplicationData2(ref.value))
  }

  private fun as_253967602(): IApplicationData3.WithDefault {
    if(pointer == NULL) {
      return(IApplicationData3.ABI.makeIApplicationData3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationData3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationData3.ABI.makeIApplicationData3(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationData> {
    public override fun getValue() = ApplicationData(pointer.getPointer(0))

    public fun setValue(value: ApplicationData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationData, MemoryAddress> {
    public val IApplicationDataStatics2_Instance: IApplicationDataStatics2 by lazy {
      createIApplicationDataStatics2()
    }


    public val IApplicationDataStatics_Instance: IApplicationDataStatics by lazy {
      createIApplicationDataStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIApplicationDataStatics2(): IApplicationDataStatics2 {
      val refiid = Guid.REFIID(IApplicationDataStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.ApplicationData".toHandle(),refiid,interfacePtr)
      val result = IApplicationDataStatics2.ABI.makeIApplicationDataStatics2(interfacePtr.value)
      return result
    }

    public fun createIApplicationDataStatics(): IApplicationDataStatics {
      val refiid = Guid.REFIID(IApplicationDataStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.ApplicationData".toHandle(),refiid,interfacePtr)
      val result = IApplicationDataStatics.ABI.makeIApplicationDataStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ApplicationData {
      val address = segment.toRawLongValue()
      return ApplicationData(Pointer(address))
    }

    public override fun toNative(obj: ApplicationData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUserAsync(user: User) =
        ABI.IApplicationDataStatics2_Instance.GetForUserAsync(user)

    public fun get_Current() = ABI.IApplicationDataStatics_Instance.get_Current()
  }
}
