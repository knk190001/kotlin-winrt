package Microsoft.UI.Xaml

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

@ABIMarker(FrameworkView.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.FrameworkView;{e60094c3-45af-5a8f-9511-1781d7df1799})")
@WinRTByReference(brClass = FrameworkView.ByReference::class)
public class FrameworkView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameworkView.WithDefault,
    Windows.ApplicationModel.Core.IFrameworkView.WithDefault, IWinRTObject {
  private val __1033151708_Interface: IFrameworkView.WithDefault by lazy {
    as_1033151708()
  }


  private val __284736419_Interface: Windows.ApplicationModel.Core.IFrameworkView.WithDefault by
      lazy {
    as_284736419()
  }


  public override val __1033151708_Ptr: JNAPointer? by lazy {
    __1033151708_Interface.__1033151708_Ptr
  }


  public override val __284736419_Ptr: JNAPointer? by lazy {
    __284736419_Interface.__284736419_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1033151708_Interface, __284736419_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1033151708(): IFrameworkView.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkView.ABI.makeIFrameworkView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkView.ABI.makeIFrameworkView(ref.value))
  }

  private fun as_284736419(): Windows.ApplicationModel.Core.IFrameworkView.WithDefault {
    if(pointer == NULL) {
      return(Windows.ApplicationModel.Core.IFrameworkView.ABI.makeIFrameworkView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<Windows.ApplicationModel.Core.IFrameworkView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(Windows.ApplicationModel.Core.IFrameworkView.ABI.makeIFrameworkView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FrameworkView>
      {
    public override fun getValue() = FrameworkView(pointer.getPointer(0))

    public fun setValue(value: FrameworkView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameworkView, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.FrameworkView".toHandle(), refiid,
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

    public override fun fromNative(segment: MemoryAddress): FrameworkView {
      val address = segment.toRawLongValue()
      return FrameworkView(Pointer(address))
    }

    public override fun toNative(obj: FrameworkView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
