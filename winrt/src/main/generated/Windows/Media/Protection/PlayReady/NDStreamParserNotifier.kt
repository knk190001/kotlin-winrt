package Windows.Media.Protection.PlayReady

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

@ABIMarker(NDStreamParserNotifier.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.NDStreamParserNotifier;{c167acd0-2ce6-426c-ace5-5e9275fea715})")
@WinRTByReference(brClass = NDStreamParserNotifier.ByReference::class)
public class NDStreamParserNotifier(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INDStreamParserNotifier.WithDefault, IWinRTObject {
  private val __1899335605_Interface: INDStreamParserNotifier.WithDefault by lazy {
    as_1899335605()
  }


  public override val __1899335605_Ptr: JNAPointer? by lazy {
    __1899335605_Interface.__1899335605_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1899335605_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1899335605(): INDStreamParserNotifier.WithDefault {
    if(pointer == NULL) {
      return(INDStreamParserNotifier.ABI.makeINDStreamParserNotifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INDStreamParserNotifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INDStreamParserNotifier.ABI.makeINDStreamParserNotifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NDStreamParserNotifier> {
    public override fun getValue() = NDStreamParserNotifier(pointer.getPointer(0))

    public fun setValue(value: NDStreamParserNotifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NDStreamParserNotifier, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.NDStreamParserNotifier".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): NDStreamParserNotifier {
      val address = segment.toRawLongValue()
      return NDStreamParserNotifier(Pointer(address))
    }

    public override fun toNative(obj: NDStreamParserNotifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
