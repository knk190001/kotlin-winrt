package Microsoft.UI.Xaml.Controls

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

@ABIMarker(PivotItemEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PivotItemEventArgs;{e42c62c2-0cb9-5e5b-8148-8d80a3838de9})")
@WinRTByReference(brClass = PivotItemEventArgs.ByReference::class)
public class PivotItemEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPivotItemEventArgs.WithDefault, IWinRTObject {
  private val __616387159_Interface: IPivotItemEventArgs.WithDefault by lazy {
    as_616387159()
  }


  public override val __616387159_Ptr: JNAPointer? by lazy {
    __616387159_Interface.__616387159_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__616387159_Interface)

  public constructor() : this(ABI.activate())

  private fun as_616387159(): IPivotItemEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPivotItemEventArgs.ABI.makeIPivotItemEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPivotItemEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPivotItemEventArgs.ABI.makeIPivotItemEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PivotItemEventArgs> {
    public override fun getValue() = PivotItemEventArgs(pointer.getPointer(0))

    public fun setValue(value: PivotItemEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PivotItemEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PivotItemEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PivotItemEventArgs {
      val address = segment.toRawLongValue()
      return PivotItemEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PivotItemEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
