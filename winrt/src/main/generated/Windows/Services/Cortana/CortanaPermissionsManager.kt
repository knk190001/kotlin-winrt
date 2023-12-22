package Windows.Services.Cortana

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

@ABIMarker(CortanaPermissionsManager.ABI::class)
@Signature("rc(Windows.Services.Cortana.CortanaPermissionsManager;{191330e0-8695-438a-9545-3da4e822ddb4})")
@WinRTByReference(brClass = CortanaPermissionsManager.ByReference::class)
public class CortanaPermissionsManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICortanaPermissionsManager.WithDefault, IWinRTObject {
  private val __789771513_Interface: ICortanaPermissionsManager.WithDefault by lazy {
    as_789771513()
  }


  public override val __789771513_Ptr: JNAPointer? by lazy {
    __789771513_Interface.__789771513_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__789771513_Interface)

  private fun as_789771513(): ICortanaPermissionsManager.WithDefault {
    if(pointer == NULL) {
      return(ICortanaPermissionsManager.ABI.makeICortanaPermissionsManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICortanaPermissionsManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICortanaPermissionsManager.ABI.makeICortanaPermissionsManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CortanaPermissionsManager> {
    public override fun getValue() = CortanaPermissionsManager(pointer.getPointer(0))

    public fun setValue(value: CortanaPermissionsManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CortanaPermissionsManager, MemoryAddress> {
    public val ICortanaPermissionsManagerStatics_Instance: ICortanaPermissionsManagerStatics by
        lazy {
      createICortanaPermissionsManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICortanaPermissionsManagerStatics(): ICortanaPermissionsManagerStatics {
      val refiid = Guid.REFIID(ICortanaPermissionsManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Cortana.CortanaPermissionsManager".toHandle(),refiid,interfacePtr)
      val result =
          ICortanaPermissionsManagerStatics.ABI.makeICortanaPermissionsManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CortanaPermissionsManager {
      val address = segment.toRawLongValue()
      return CortanaPermissionsManager(Pointer(address))
    }

    public override fun toNative(obj: CortanaPermissionsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.ICortanaPermissionsManagerStatics_Instance.GetDefault()
  }
}
