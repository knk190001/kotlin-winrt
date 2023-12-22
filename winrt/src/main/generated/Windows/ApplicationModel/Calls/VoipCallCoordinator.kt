package Windows.ApplicationModel.Calls

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

@ABIMarker(VoipCallCoordinator.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.VoipCallCoordinator;{4f118bcf-e8ef-4434-9c5f-a8d893fafe79})")
@WinRTByReference(brClass = VoipCallCoordinator.ByReference::class)
public class VoipCallCoordinator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoipCallCoordinator.WithDefault, IVoipCallCoordinator2.WithDefault,
    IVoipCallCoordinator3.WithDefault, IVoipCallCoordinator4.WithDefault, IWinRTObject {
  private val __1372871924_Interface: IVoipCallCoordinator.WithDefault by lazy {
    as_1372871924()
  }


  private val __390643266_Interface: IVoipCallCoordinator2.WithDefault by lazy {
    as_390643266()
  }


  private val __390643265_Interface: IVoipCallCoordinator3.WithDefault by lazy {
    as_390643265()
  }


  private val __390643264_Interface: IVoipCallCoordinator4.WithDefault by lazy {
    as_390643264()
  }


  public override val __1372871924_Ptr: JNAPointer? by lazy {
    __1372871924_Interface.__1372871924_Ptr
  }


  public override val __390643266_Ptr: JNAPointer? by lazy {
    __390643266_Interface.__390643266_Ptr
  }


  public override val __390643265_Ptr: JNAPointer? by lazy {
    __390643265_Interface.__390643265_Ptr
  }


  public override val __390643264_Ptr: JNAPointer? by lazy {
    __390643264_Interface.__390643264_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1372871924_Interface, __390643266_Interface, __390643265_Interface,
        __390643264_Interface)

  private fun as_1372871924(): IVoipCallCoordinator.WithDefault {
    if(pointer == NULL) {
      return(IVoipCallCoordinator.ABI.makeIVoipCallCoordinator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoipCallCoordinator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoipCallCoordinator.ABI.makeIVoipCallCoordinator(ref.value))
  }

  private fun as_390643266(): IVoipCallCoordinator2.WithDefault {
    if(pointer == NULL) {
      return(IVoipCallCoordinator2.ABI.makeIVoipCallCoordinator2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoipCallCoordinator2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoipCallCoordinator2.ABI.makeIVoipCallCoordinator2(ref.value))
  }

  private fun as_390643265(): IVoipCallCoordinator3.WithDefault {
    if(pointer == NULL) {
      return(IVoipCallCoordinator3.ABI.makeIVoipCallCoordinator3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoipCallCoordinator3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoipCallCoordinator3.ABI.makeIVoipCallCoordinator3(ref.value))
  }

  private fun as_390643264(): IVoipCallCoordinator4.WithDefault {
    if(pointer == NULL) {
      return(IVoipCallCoordinator4.ABI.makeIVoipCallCoordinator4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoipCallCoordinator4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoipCallCoordinator4.ABI.makeIVoipCallCoordinator4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoipCallCoordinator> {
    public override fun getValue() = VoipCallCoordinator(pointer.getPointer(0))

    public fun setValue(value: VoipCallCoordinator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoipCallCoordinator, MemoryAddress> {
    public val IVoipCallCoordinatorStatics_Instance: IVoipCallCoordinatorStatics by lazy {
      createIVoipCallCoordinatorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVoipCallCoordinatorStatics(): IVoipCallCoordinatorStatics {
      val refiid = Guid.REFIID(IVoipCallCoordinatorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.VoipCallCoordinator".toHandle(),refiid,interfacePtr)
      val result =
          IVoipCallCoordinatorStatics.ABI.makeIVoipCallCoordinatorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VoipCallCoordinator {
      val address = segment.toRawLongValue()
      return VoipCallCoordinator(Pointer(address))
    }

    public override fun toNative(obj: VoipCallCoordinator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IVoipCallCoordinatorStatics_Instance.GetDefault()
  }
}
