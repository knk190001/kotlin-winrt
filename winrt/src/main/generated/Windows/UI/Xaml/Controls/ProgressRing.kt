package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ProgressRing.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ProgressRing;{6da5e49e-6e9d-425c-bd7c-02173e39763f})")
@WinRTByReference(brClass = ProgressRing.ByReference::class)
public class ProgressRing(
  ptr: JNAPointer? = NULL
) : Control(ptr), IProgressRing.WithDefault, IWinRTObject {
  private val __2079183897_Interface: IProgressRing.WithDefault by lazy {
    as_2079183897()
  }


  public override val __2079183897_Ptr: JNAPointer? by lazy {
    __2079183897_Interface.__2079183897_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2079183897_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2079183897(): IProgressRing.WithDefault {
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
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IProgressRingStatics_Instance: IProgressRingStatics by lazy {
      createIProgressRingStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ProgressRing".toHandle(),
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

    public fun createIProgressRingStatics(): IProgressRingStatics {
      val refiid = Guid.REFIID(IProgressRingStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ProgressRing".toHandle(),refiid,interfacePtr)
      val result = IProgressRingStatics.ABI.makeIProgressRingStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ProgressRing {
      val address = segment.toRawLongValue()
      return ProgressRing(Pointer(address))
    }

    public override fun toNative(obj: ProgressRing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsActiveProperty() = ABI.IProgressRingStatics_Instance.get_IsActiveProperty()
  }
}
