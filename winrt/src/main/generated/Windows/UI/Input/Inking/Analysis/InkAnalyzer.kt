package Windows.UI.Input.Inking.Analysis

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

@ABIMarker(InkAnalyzer.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Analysis.InkAnalyzer;{f12b8f95-0866-4dc5-8c77-f88614dfe38c})")
@WinRTByReference(brClass = InkAnalyzer.ByReference::class)
public class InkAnalyzer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkAnalyzer.WithDefault, IWinRTObject {
  private val __1938380670_Interface: IInkAnalyzer.WithDefault by lazy {
    as_1938380670()
  }


  public override val __1938380670_Ptr: JNAPointer? by lazy {
    __1938380670_Interface.__1938380670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1938380670_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1938380670(): IInkAnalyzer.WithDefault {
    if(pointer == NULL) {
      return(IInkAnalyzer.ABI.makeIInkAnalyzer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkAnalyzer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkAnalyzer.ABI.makeIInkAnalyzer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InkAnalyzer> {
    public override fun getValue() = InkAnalyzer(pointer.getPointer(0))

    public fun setValue(value: InkAnalyzer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkAnalyzer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.Analysis.InkAnalyzer".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InkAnalyzer {
      val address = segment.toRawLongValue()
      return InkAnalyzer(Pointer(address))
    }

    public override fun toNative(obj: InkAnalyzer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
