package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.FrameworkElement
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
@Signature("rc(Microsoft.UI.Xaml.Controls.RichTextBlockOverflow;{015c2522-0646-5c71-9f54-3c38c7235a62})")
@WinRTByReference(brClass = RichTextBlockOverflow.ByReference::class)
public class RichTextBlockOverflow(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IRichTextBlockOverflow.WithDefault, IWinRTObject {
  private val __2095641953_Interface: IRichTextBlockOverflow.WithDefault by lazy {
    as_2095641953()
  }


  public override val __2095641953_Ptr: JNAPointer? by lazy {
    __2095641953_Interface.__2095641953_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2095641953_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2095641953(): IRichTextBlockOverflow.WithDefault {
    if(pointer == NULL) {
      return(IRichTextBlockOverflow.ABI.makeIRichTextBlockOverflow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichTextBlockOverflow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichTextBlockOverflow.ABI.makeIRichTextBlockOverflow(ref.value))
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


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RichTextBlockOverflow".toHandle(),
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RichTextBlockOverflow".toHandle(),refiid,interfacePtr)
      val result =
          IRichTextBlockOverflowStatics.ABI.makeIRichTextBlockOverflowStatics(interfacePtr.value)
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

    public fun get_MaxLinesProperty() =
        ABI.IRichTextBlockOverflowStatics_Instance.get_MaxLinesProperty()

    public fun get_IsTextTrimmedProperty() =
        ABI.IRichTextBlockOverflowStatics_Instance.get_IsTextTrimmedProperty()
  }
}
