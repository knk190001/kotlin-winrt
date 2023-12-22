package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.FrameworkElement
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

@ABIMarker(RichTextBlockOverflow.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RichTextBlockOverflow;{4f93749b-dac3-4a42-9cbb-99f0de37c071})")
@WinRTByReference(brClass = RichTextBlockOverflow.ByReference::class)
public class RichTextBlockOverflow(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IRichTextBlockOverflow.WithDefault, IRichTextBlockOverflow2.WithDefault,
    IRichTextBlockOverflow3.WithDefault, IWinRTObject {
  private val __1634978966_Interface: IRichTextBlockOverflow.WithDefault by lazy {
    as_1634978966()
  }


  private val __855259656_Interface: IRichTextBlockOverflow2.WithDefault by lazy {
    as_855259656()
  }


  private val __855259657_Interface: IRichTextBlockOverflow3.WithDefault by lazy {
    as_855259657()
  }


  public override val __1634978966_Ptr: JNAPointer? by lazy {
    __1634978966_Interface.__1634978966_Ptr
  }


  public override val __855259656_Ptr: JNAPointer? by lazy {
    __855259656_Interface.__855259656_Ptr
  }


  public override val __855259657_Ptr: JNAPointer? by lazy {
    __855259657_Interface.__855259657_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1634978966_Interface, __855259656_Interface, __855259657_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1634978966(): IRichTextBlockOverflow.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlockOverflow.ABI.makeIRichTextBlockOverflow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlockOverflow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlockOverflow.ABI.makeIRichTextBlockOverflow(ref.value))
  }

  private fun as_855259656(): IRichTextBlockOverflow2.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlockOverflow2.ABI.makeIRichTextBlockOverflow2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlockOverflow2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlockOverflow2.ABI.makeIRichTextBlockOverflow2(ref.value))
  }

  private fun as_855259657(): IRichTextBlockOverflow3.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlockOverflow3.ABI.makeIRichTextBlockOverflow3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlockOverflow3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlockOverflow3.ABI.makeIRichTextBlockOverflow3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RichTextBlockOverflow> {
    public override fun getValue() = RichTextBlockOverflow(pointer.getPointer(0))

    public fun setValue(value: RichTextBlockOverflow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichTextBlockOverflow, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRichTextBlockOverflowStatics_Instance: IRichTextBlockOverflowStatics by lazy {
      createIRichTextBlockOverflowStatics()
    }


    public val IRichTextBlockOverflowStatics3_Instance: IRichTextBlockOverflowStatics3 by lazy {
      createIRichTextBlockOverflowStatics3()
    }


    public val IRichTextBlockOverflowStatics2_Instance: IRichTextBlockOverflowStatics2 by lazy {
      createIRichTextBlockOverflowStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlockOverflow".toHandle(),
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

    public fun createIRichTextBlockOverflowStatics(): IRichTextBlockOverflowStatics {
      val refiid = Guid.REFIID(IRichTextBlockOverflowStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlockOverflow".toHandle(),refiid,interfacePtr)
      val result =
          IRichTextBlockOverflowStatics.ABI.makeIRichTextBlockOverflowStatics(interfacePtr.value)
      return result
    }

    public fun createIRichTextBlockOverflowStatics3(): IRichTextBlockOverflowStatics3 {
      val refiid = Guid.REFIID(IRichTextBlockOverflowStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlockOverflow".toHandle(),refiid,interfacePtr)
      val result =
          IRichTextBlockOverflowStatics3.ABI.makeIRichTextBlockOverflowStatics3(interfacePtr.value)
      return result
    }

    public fun createIRichTextBlockOverflowStatics2(): IRichTextBlockOverflowStatics2 {
      val refiid = Guid.REFIID(IRichTextBlockOverflowStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RichTextBlockOverflow".toHandle(),refiid,interfacePtr)
      val result =
          IRichTextBlockOverflowStatics2.ABI.makeIRichTextBlockOverflowStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RichTextBlockOverflow {
      val address = segment.toRawLongValue()
      return RichTextBlockOverflow(Pointer(address))
    }

    public override fun toNative(obj: RichTextBlockOverflow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OverflowContentTargetProperty() =
        ABI.IRichTextBlockOverflowStatics_Instance.get_OverflowContentTargetProperty()

    public fun get_PaddingProperty() =
        ABI.IRichTextBlockOverflowStatics_Instance.get_PaddingProperty()

    public fun get_HasOverflowContentProperty() =
        ABI.IRichTextBlockOverflowStatics_Instance.get_HasOverflowContentProperty()

    public fun get_IsTextTrimmedProperty() =
        ABI.IRichTextBlockOverflowStatics3_Instance.get_IsTextTrimmedProperty()

    public fun get_MaxLinesProperty() =
        ABI.IRichTextBlockOverflowStatics2_Instance.get_MaxLinesProperty()
  }
}
