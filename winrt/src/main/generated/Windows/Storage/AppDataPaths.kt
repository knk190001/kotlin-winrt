package Windows.Storage

import Windows.System.User
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

@ABIMarker(AppDataPaths.ABI::class)
@Signature("rc(Windows.Storage.AppDataPaths;{7301d60a-79a2-48c9-9ec0-3fda092f79e1})")
@WinRTByReference(brClass = AppDataPaths.ByReference::class)
public class AppDataPaths(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppDataPaths.WithDefault, IWinRTObject {
  private val __989297316_Interface: IAppDataPaths.WithDefault by lazy {
    as_989297316()
  }


  public override val __989297316_Ptr: JNAPointer? by lazy {
    __989297316_Interface.__989297316_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__989297316_Interface)

  private fun as_989297316(): IAppDataPaths.WithDefault {
    if(pointer == NULL) {
      return(IAppDataPaths.ABI.makeIAppDataPaths(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppDataPaths>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppDataPaths.ABI.makeIAppDataPaths(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppDataPaths> {
    public override fun getValue() = AppDataPaths(pointer.getPointer(0))

    public fun setValue(value: AppDataPaths): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppDataPaths, MemoryAddress> {
    public val IAppDataPathsStatics_Instance: IAppDataPathsStatics by lazy {
      createIAppDataPathsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppDataPathsStatics(): IAppDataPathsStatics {
      val refiid = Guid.REFIID(IAppDataPathsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.AppDataPaths".toHandle(),refiid,interfacePtr)
      val result = IAppDataPathsStatics.ABI.makeIAppDataPathsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppDataPaths {
      val address = segment.toRawLongValue()
      return AppDataPaths(Pointer(address))
    }

    public override fun toNative(obj: AppDataPaths): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUser(user: User) = ABI.IAppDataPathsStatics_Instance.GetForUser(user)

    public fun GetDefault() = ABI.IAppDataPathsStatics_Instance.GetDefault()
  }
}
