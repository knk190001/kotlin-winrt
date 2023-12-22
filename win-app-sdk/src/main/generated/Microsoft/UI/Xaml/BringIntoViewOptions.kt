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

@ABIMarker(BringIntoViewOptions.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.BringIntoViewOptions;{eeb4a447-eb9e-5003-a479-b9e3a886b708})")
@WinRTByReference(brClass = BringIntoViewOptions.ByReference::class)
public class BringIntoViewOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBringIntoViewOptions.WithDefault, IWinRTObject {
  private val __1094950030_Interface: IBringIntoViewOptions.WithDefault by lazy {
    as_1094950030()
  }


  public override val __1094950030_Ptr: JNAPointer? by lazy {
    __1094950030_Interface.__1094950030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1094950030_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1094950030(): IBringIntoViewOptions.WithDefault {
    if(pointer == NULL) {
      return(IBringIntoViewOptions.ABI.makeIBringIntoViewOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBringIntoViewOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBringIntoViewOptions.ABI.makeIBringIntoViewOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BringIntoViewOptions> {
    public override fun getValue() = BringIntoViewOptions(pointer.getPointer(0))

    public fun setValue(value: BringIntoViewOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BringIntoViewOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.BringIntoViewOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): BringIntoViewOptions {
      val address = segment.toRawLongValue()
      return BringIntoViewOptions(Pointer(address))
    }

    public override fun toNative(obj: BringIntoViewOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
