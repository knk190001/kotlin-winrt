package Windows.UI.Xaml

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

@ABIMarker(VisualState.ABI::class)
@Signature("rc(Windows.UI.Xaml.VisualState;{6320affc-c31a-4450-afde-f6ea7bd1f586})")
@WinRTByReference(brClass = VisualState.ByReference::class)
public class VisualState(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IVisualState.WithDefault, IVisualState2.WithDefault, IWinRTObject {
  private val __238794849_Interface: IVisualState.WithDefault by lazy {
    as_238794849()
  }


  private val __1187294323_Interface: IVisualState2.WithDefault by lazy {
    as_1187294323()
  }


  public override val __238794849_Ptr: JNAPointer? by lazy {
    __238794849_Interface.__238794849_Ptr
  }


  public override val __1187294323_Ptr: JNAPointer? by lazy {
    __1187294323_Interface.__1187294323_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__238794849_Interface, __1187294323_Interface)

  public constructor() : this(ABI.activate())

  private fun as_238794849(): IVisualState.WithDefault {
    if(pointer == NULL) {
      return(IVisualState.ABI.makeIVisualState(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualState>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualState.ABI.makeIVisualState(ref.value))
  }

  private fun as_1187294323(): IVisualState2.WithDefault {
    if(pointer == NULL) {
      return(IVisualState2.ABI.makeIVisualState2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualState2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualState2.ABI.makeIVisualState2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VisualState> {
    public override fun getValue() = VisualState(pointer.getPointer(0))

    public fun setValue(value: VisualState): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualState, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.VisualState".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): VisualState {
      val address = segment.toRawLongValue()
      return VisualState(Pointer(address))
    }

    public override fun toNative(obj: VisualState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
