package Windows.Foundation.Diagnostics

import Windows.Foundation.Diagnostics.ILoggingActivityFactory.ABI.IID
import Windows.Foundation.IClosable
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LoggingActivity.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.LoggingActivity;{bc032941-b766-4cb5-9848-97ac6ba6d60c})")
@WinRTByReference(brClass = LoggingActivity.ByReference::class)
public class LoggingActivity(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILoggingActivity.WithDefault, IClosable.WithDefault,
    ILoggingActivity2.WithDefault, ILoggingTarget.WithDefault, IWinRTObject {
  private val __1778097377_Interface: ILoggingActivity.WithDefault by lazy {
    as_1778097377()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __713556111_Interface: ILoggingActivity2.WithDefault by lazy {
    as_713556111()
  }


  private val __1118672925_Interface: ILoggingTarget.WithDefault by lazy {
    as_1118672925()
  }


  public override val __1778097377_Ptr: JNAPointer? by lazy {
    __1778097377_Interface.__1778097377_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __713556111_Ptr: JNAPointer? by lazy {
    __713556111_Interface.__713556111_Ptr
  }


  public override val __1118672925_Ptr: JNAPointer? by lazy {
    __1118672925_Interface.__1118672925_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1778097377_Interface, __1260617006_Interface, __713556111_Interface,
        __1118672925_Interface)

  public constructor(activityName: String, loggingChannel: ILoggingChannel) :
      this(ABI.activate(activityName, loggingChannel))

  public constructor(
    activityName: String,
    loggingChannel: ILoggingChannel,
    level: LoggingLevel
  ) : this(ABI.activate(activityName, loggingChannel, level))

  private fun as_1778097377(): ILoggingActivity.WithDefault {
    if(pointer == NULL) {
      return(ILoggingActivity.ABI.makeILoggingActivity(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoggingActivity>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoggingActivity.ABI.makeILoggingActivity(ref.value))
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

  private fun as_713556111(): ILoggingActivity2.WithDefault {
    if(pointer == NULL) {
      return(ILoggingActivity2.ABI.makeILoggingActivity2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoggingActivity2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoggingActivity2.ABI.makeILoggingActivity2(ref.value))
  }

  private fun as_1118672925(): ILoggingTarget.WithDefault {
    if(pointer == NULL) {
      return(ILoggingTarget.ABI.makeILoggingTarget(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoggingTarget>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoggingTarget.ABI.makeILoggingTarget(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoggingActivity> {
    public override fun getValue() = LoggingActivity(pointer.getPointer(0))

    public fun setValue(value: LoggingActivity): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoggingActivity, MemoryAddress> {
    public val ILoggingActivityFactory_Instance: ILoggingActivityFactory by lazy {
      createILoggingActivityFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILoggingActivityFactory(): ILoggingActivityFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.LoggingActivity".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILoggingActivityFactory.ABI.makeILoggingActivityFactory(factoryActivatorPtr.value))
    }

    public fun activate(activityName: String, loggingChannel: ILoggingChannel): JNAPointer? =
        ILoggingActivityFactory_Instance.CreateLoggingActivity(activityName,
        loggingChannel)?.pointer

    public fun activate(
      activityName: String,
      loggingChannel: ILoggingChannel,
      level: LoggingLevel
    ): JNAPointer? = ILoggingActivityFactory_Instance.CreateLoggingActivityWithLevel(activityName,
        loggingChannel, level)?.pointer

    public override fun fromNative(segment: MemoryAddress): LoggingActivity {
      val address = segment.toRawLongValue()
      return LoggingActivity(Pointer(address))
    }

    public override fun toNative(obj: LoggingActivity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
