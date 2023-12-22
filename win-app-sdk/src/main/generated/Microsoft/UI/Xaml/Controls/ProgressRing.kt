package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IProgressRingFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ProgressRing.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ProgressRing;{2670d03f-e28c-5652-bee2-b5212ebdf7ff})")
@WinRTByReference(brClass = ProgressRing.ByReference::class)
public open class ProgressRing(
  ptr: JNAPointer? = NULL
) : Control(ptr), IProgressRing.WithDefault, IWinRTObject {
  private val __476373692_Interface: IProgressRing.WithDefault by lazy {
    as_476373692()
  }


  public override val __476373692_Ptr: JNAPointer? by lazy {
    __476373692_Interface.__476373692_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__476373692_Interface)

  public constructor() : this(ABI.activate())

  private fun as_476373692(): IProgressRing.WithDefault {
    if(pointer == NULL) {
      return(IProgressRing.ABI.makeIProgressRing(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProgressRing>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProgressRing.ABI.makeIProgressRing(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ProgressRing> {
    public override fun getValue() = ProgressRing(pointer.getPointer(0))

    public fun setValue(value: ProgressRing): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProgressRing, MemoryAddress> {
    public val IProgressRingStatics_Instance: IProgressRingStatics by lazy {
      createIProgressRingStatics()
    }


    public val IProgressRingFactory_Instance: IProgressRingFactory by lazy {
      createIProgressRingFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProgressRingStatics(): IProgressRingStatics {
      val refiid = Guid.REFIID(IProgressRingStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ProgressRing".toHandle(),refiid,interfacePtr)
      val result = IProgressRingStatics.ABI.makeIProgressRingStatics(interfacePtr.value)
      return result
    }

    public fun createIProgressRingFactory(): IProgressRingFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ProgressRing".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IProgressRingFactory.ABI.makeIProgressRingFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IProgressRingFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ProgressRing {
      val address = segment.toRawLongValue()
      return ProgressRing(Pointer(address))
    }

    public override fun toNative(obj: ProgressRing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsActiveProperty() = ABI.IProgressRingStatics_Instance.get_IsActiveProperty()

    public fun get_IsIndeterminateProperty() =
        ABI.IProgressRingStatics_Instance.get_IsIndeterminateProperty()

    public fun get_ValueProperty() = ABI.IProgressRingStatics_Instance.get_ValueProperty()

    public fun get_MinimumProperty() = ABI.IProgressRingStatics_Instance.get_MinimumProperty()

    public fun get_MaximumProperty() = ABI.IProgressRingStatics_Instance.get_MaximumProperty()
  }
}
