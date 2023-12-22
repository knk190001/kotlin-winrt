package Windows.ApplicationModel.DataTransfer.ShareTarget

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

@ABIMarker(QuickLink.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink;{603e4308-f0be-4adc-acc9-8b27ab9cf556})")
@WinRTByReference(brClass = QuickLink.ByReference::class)
public class QuickLink(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IQuickLink.WithDefault, IWinRTObject {
  private val __943907391_Interface: IQuickLink.WithDefault by lazy {
    as_943907391()
  }


  public override val __943907391_Ptr: JNAPointer? by lazy {
    __943907391_Interface.__943907391_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__943907391_Interface)

  public constructor() : this(ABI.activate())

  private fun as_943907391(): IQuickLink.WithDefault {
    if(pointer == NULL) {
      return(IQuickLink.ABI.makeIQuickLink(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IQuickLink>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IQuickLink.ABI.makeIQuickLink(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<QuickLink> {
    public override fun getValue() = QuickLink(pointer.getPointer(0))

    public fun setValue(value: QuickLink): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<QuickLink, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): QuickLink {
      val address = segment.toRawLongValue()
      return QuickLink(Pointer(address))
    }

    public override fun toNative(obj: QuickLink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
