package Windows.UI.Xaml.Printing

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

@ABIMarker(AddPagesEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Printing.AddPagesEventArgs;{e2e52be5-056c-4420-9795-cb3526ce0c20})")
@WinRTByReference(brClass = AddPagesEventArgs.ByReference::class)
public class AddPagesEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAddPagesEventArgs.WithDefault, IWinRTObject {
  private val __1734605001_Interface: IAddPagesEventArgs.WithDefault by lazy {
    as_1734605001()
  }


  public override val __1734605001_Ptr: JNAPointer? by lazy {
    __1734605001_Interface.__1734605001_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1734605001_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1734605001(): IAddPagesEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAddPagesEventArgs.ABI.makeIAddPagesEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAddPagesEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAddPagesEventArgs.ABI.makeIAddPagesEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AddPagesEventArgs> {
    public override fun getValue() = AddPagesEventArgs(pointer.getPointer(0))

    public fun setValue(value: AddPagesEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AddPagesEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Printing.AddPagesEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AddPagesEventArgs {
      val address = segment.toRawLongValue()
      return AddPagesEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AddPagesEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
