package Windows.UI.Xaml.Documents

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

@ABIMarker(Run.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.Run;{59553c83-0e14-49bd-b84b-c526f3034349})")
@WinRTByReference(brClass = Run.ByReference::class)
public class Run(
  ptr: JNAPointer? = NULL
) : Inline(ptr), IRun.WithDefault, IWinRTObject {
  private val __1957432477_Interface: IRun.WithDefault by lazy {
    as_1957432477()
  }


  public override val __1957432477_Ptr: JNAPointer? by lazy {
    __1957432477_Interface.__1957432477_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1957432477_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1957432477(): IRun.WithDefault {
    if(pointer == NULL) {
      return(IRun.ABI.makeIRun(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRun>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRun.ABI.makeIRun(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Run> {
    public override fun getValue() = Run(pointer.getPointer(0))

    public fun setValue(value: Run): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Run, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRunStatics_Instance: IRunStatics by lazy {
      createIRunStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Run".toHandle(), refiid,
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

    public fun createIRunStatics(): IRunStatics {
      val refiid = Guid.REFIID(IRunStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Run".toHandle(),refiid,interfacePtr)
      val result = IRunStatics.ABI.makeIRunStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Run {
      val address = segment.toRawLongValue()
      return Run(Pointer(address))
    }

    public override fun toNative(obj: Run): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FlowDirectionProperty() = ABI.IRunStatics_Instance.get_FlowDirectionProperty()
  }
}
