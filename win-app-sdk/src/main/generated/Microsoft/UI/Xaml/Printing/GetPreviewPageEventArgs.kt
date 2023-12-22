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

@ABIMarker(GetPreviewPageEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Printing.GetPreviewPageEventArgs;{a68fbe17-f577-597f-b3ab-b379447149e6})")
@WinRTByReference(brClass = GetPreviewPageEventArgs.ByReference::class)
public class GetPreviewPageEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGetPreviewPageEventArgs.WithDefault, IWinRTObject {
  private val __655708402_Interface: IGetPreviewPageEventArgs.WithDefault by lazy {
    as_655708402()
  }


  public override val __655708402_Ptr: JNAPointer? by lazy {
    __655708402_Interface.__655708402_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__655708402_Interface)

  public constructor() : this(ABI.activate())

  private fun as_655708402(): IGetPreviewPageEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGetPreviewPageEventArgs.ABI.makeIGetPreviewPageEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGetPreviewPageEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGetPreviewPageEventArgs.ABI.makeIGetPreviewPageEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GetPreviewPageEventArgs> {
    public override fun getValue() = GetPreviewPageEventArgs(pointer.getPointer(0))

    public fun setValue(value: GetPreviewPageEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GetPreviewPageEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Printing.GetPreviewPageEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): GetPreviewPageEventArgs {
      val address = segment.toRawLongValue()
      return GetPreviewPageEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GetPreviewPageEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
