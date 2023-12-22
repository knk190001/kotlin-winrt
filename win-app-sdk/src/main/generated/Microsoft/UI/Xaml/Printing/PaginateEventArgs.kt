package Microsoft.UI.Xaml.Printing

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

@ABIMarker(PaginateEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Printing.PaginateEventArgs;{6499c196-11a9-5ef8-91cb-52fb963bf172})")
@WinRTByReference(brClass = PaginateEventArgs.ByReference::class)
public class PaginateEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaginateEventArgs.WithDefault, IWinRTObject {
  private val __1301141144_Interface: IPaginateEventArgs.WithDefault by lazy {
    as_1301141144()
  }


  public override val __1301141144_Ptr: JNAPointer? by lazy {
    __1301141144_Interface.__1301141144_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1301141144_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1301141144(): IPaginateEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPaginateEventArgs.ABI.makeIPaginateEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaginateEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaginateEventArgs.ABI.makeIPaginateEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaginateEventArgs> {
    public override fun getValue() = PaginateEventArgs(pointer.getPointer(0))

    public fun setValue(value: PaginateEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaginateEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Printing.PaginateEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PaginateEventArgs {
      val address = segment.toRawLongValue()
      return PaginateEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PaginateEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
