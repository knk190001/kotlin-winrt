package Windows.UI.StartScreen

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

@ABIMarker(StartScreenManager.ABI::class)
@Signature("rc(Windows.UI.StartScreen.StartScreenManager;{4a1dcbcb-26e9-4eb4-8933-859eb6ecdb29})")
@WinRTByReference(brClass = StartScreenManager.ByReference::class)
public class StartScreenManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStartScreenManager.WithDefault, IStartScreenManager2.WithDefault,
    IWinRTObject {
  private val __169577399_Interface: IStartScreenManager.WithDefault by lazy {
    as_169577399()
  }


  private val __961932023_Interface: IStartScreenManager2.WithDefault by lazy {
    as_961932023()
  }


  public override val __169577399_Ptr: JNAPointer? by lazy {
    __169577399_Interface.__169577399_Ptr
  }


  public override val __961932023_Ptr: JNAPointer? by lazy {
    __961932023_Interface.__961932023_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__169577399_Interface, __961932023_Interface)

  private fun as_169577399(): IStartScreenManager.WithDefault {
    if(pointer == NULL) {
      return(IStartScreenManager.ABI.makeIStartScreenManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStartScreenManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStartScreenManager.ABI.makeIStartScreenManager(ref.value))
  }

  private fun as_961932023(): IStartScreenManager2.WithDefault {
    if(pointer == NULL) {
      return(IStartScreenManager2.ABI.makeIStartScreenManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStartScreenManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStartScreenManager2.ABI.makeIStartScreenManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StartScreenManager> {
    public override fun getValue() = StartScreenManager(pointer.getPointer(0))

    public fun setValue(value: StartScreenManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StartScreenManager, MemoryAddress> {
    public val IStartScreenManagerStatics_Instance: IStartScreenManagerStatics by lazy {
      createIStartScreenManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStartScreenManagerStatics(): IStartScreenManagerStatics {
      val refiid = Guid.REFIID(IStartScreenManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.StartScreen.StartScreenManager".toHandle(),refiid,interfacePtr)
      val result = IStartScreenManagerStatics.ABI.makeIStartScreenManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StartScreenManager {
      val address = segment.toRawLongValue()
      return StartScreenManager(Pointer(address))
    }

    public override fun toNative(obj: StartScreenManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IStartScreenManagerStatics_Instance.GetDefault()

    public fun GetForUser(user: User) = ABI.IStartScreenManagerStatics_Instance.GetForUser(user)
  }
}
