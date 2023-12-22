package Microsoft.UI.Xaml.Documents

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

@ABIMarker(Bold.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Documents.Bold;{241a5f5a-c164-597f-b0db-fac7431297f2})")
@WinRTByReference(brClass = Bold.ByReference::class)
public class Bold(
  ptr: JNAPointer? = NULL
) : Span(ptr), IBold.WithDefault, IWinRTObject {
  private val __1717894626_Interface: IBold.WithDefault by lazy {
    as_1717894626()
  }


  public override val __1717894626_Ptr: JNAPointer? by lazy {
    __1717894626_Interface.__1717894626_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1717894626_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1717894626(): IBold.WithDefault {
    if(pointer == NULL) {
      return(IBold.ABI.makeIBold(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBold>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBold.ABI.makeIBold(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Bold> {
    public override fun getValue() = Bold(pointer.getPointer(0))

    public fun setValue(value: Bold): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Bold, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.Bold".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Bold {
      val address = segment.toRawLongValue()
      return Bold(Pointer(address))
    }

    public override fun toNative(obj: Bold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
