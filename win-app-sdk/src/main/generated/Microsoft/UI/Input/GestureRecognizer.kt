package Microsoft.UI.Input

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

@ABIMarker(GestureRecognizer.ABI::class)
@Signature("rc(Microsoft.UI.Input.GestureRecognizer;{cda89afc-6bd0-595c-ba37-545fce5bf016})")
@WinRTByReference(brClass = GestureRecognizer.ByReference::class)
public class GestureRecognizer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGestureRecognizer.WithDefault, IWinRTObject {
  private val __1839342452_Interface: IGestureRecognizer.WithDefault by lazy {
    as_1839342452()
  }


  public override val __1839342452_Ptr: JNAPointer? by lazy {
    __1839342452_Interface.__1839342452_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1839342452_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1839342452(): IGestureRecognizer.WithDefault {
    if(pointer == NULL) {
      return(IGestureRecognizer.ABI.makeIGestureRecognizer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGestureRecognizer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGestureRecognizer.ABI.makeIGestureRecognizer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GestureRecognizer> {
    public override fun getValue() = GestureRecognizer(pointer.getPointer(0))

    public fun setValue(value: GestureRecognizer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GestureRecognizer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.GestureRecognizer".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): GestureRecognizer {
      val address = segment.toRawLongValue()
      return GestureRecognizer(Pointer(address))
    }

    public override fun toNative(obj: GestureRecognizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
