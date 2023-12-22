package Windows.ApplicationModel.Background

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BackgroundTaskBuilder.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.BackgroundTaskBuilder;{0351550e-3e64-4572-a93a-84075a37c917})")
@WinRTByReference(brClass = BackgroundTaskBuilder.ByReference::class)
public class BackgroundTaskBuilder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTaskBuilder.WithDefault, IBackgroundTaskBuilder2.WithDefault,
    IBackgroundTaskBuilder3.WithDefault, IBackgroundTaskBuilder4.WithDefault,
    IBackgroundTaskBuilder5.WithDefault, IWinRTObject {
  private val __1536227063_Interface: IBackgroundTaskBuilder.WithDefault by lazy {
    as_1536227063()
  }


  private val __378398747_Interface: IBackgroundTaskBuilder2.WithDefault by lazy {
    as_378398747()
  }


  private val __378398748_Interface: IBackgroundTaskBuilder3.WithDefault by lazy {
    as_378398748()
  }


  private val __378398749_Interface: IBackgroundTaskBuilder4.WithDefault by lazy {
    as_378398749()
  }


  private val __378398750_Interface: IBackgroundTaskBuilder5.WithDefault by lazy {
    as_378398750()
  }


  public override val __1536227063_Ptr: JNAPointer? by lazy {
    __1536227063_Interface.__1536227063_Ptr
  }


  public override val __378398747_Ptr: JNAPointer? by lazy {
    __378398747_Interface.__378398747_Ptr
  }


  public override val __378398748_Ptr: JNAPointer? by lazy {
    __378398748_Interface.__378398748_Ptr
  }


  public override val __378398749_Ptr: JNAPointer? by lazy {
    __378398749_Interface.__378398749_Ptr
  }


  public override val __378398750_Ptr: JNAPointer? by lazy {
    __378398750_Interface.__378398750_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1536227063_Interface, __378398747_Interface, __378398748_Interface,
        __378398749_Interface, __378398750_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1536227063(): IBackgroundTaskBuilder.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskBuilder.ABI.makeIBackgroundTaskBuilder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskBuilder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskBuilder.ABI.makeIBackgroundTaskBuilder(ref.value))
  }

  private fun as_378398747(): IBackgroundTaskBuilder2.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskBuilder2.ABI.makeIBackgroundTaskBuilder2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskBuilder2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskBuilder2.ABI.makeIBackgroundTaskBuilder2(ref.value))
  }

  private fun as_378398748(): IBackgroundTaskBuilder3.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskBuilder3.ABI.makeIBackgroundTaskBuilder3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskBuilder3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskBuilder3.ABI.makeIBackgroundTaskBuilder3(ref.value))
  }

  private fun as_378398749(): IBackgroundTaskBuilder4.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskBuilder4.ABI.makeIBackgroundTaskBuilder4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskBuilder4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskBuilder4.ABI.makeIBackgroundTaskBuilder4(ref.value))
  }

  private fun as_378398750(): IBackgroundTaskBuilder5.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskBuilder5.ABI.makeIBackgroundTaskBuilder5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskBuilder5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskBuilder5.ABI.makeIBackgroundTaskBuilder5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTaskBuilder> {
    public override fun getValue() = BackgroundTaskBuilder(pointer.getPointer(0))

    public fun setValue(value: BackgroundTaskBuilder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTaskBuilder, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.BackgroundTaskBuilder".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): BackgroundTaskBuilder {
      val address = segment.toRawLongValue()
      return BackgroundTaskBuilder(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTaskBuilder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
