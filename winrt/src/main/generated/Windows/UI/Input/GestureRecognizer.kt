package Windows.UI.Input

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
@Signature("rc(Windows.UI.Input.GestureRecognizer;{b47a37bf-3d6b-4f88-83e8-6dcb4012ffb0})")
@WinRTByReference(brClass = GestureRecognizer.ByReference::class)
public class GestureRecognizer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGestureRecognizer.WithDefault, IGestureRecognizer2.WithDefault, IWinRTObject
    {
  private val __156099775_Interface: IGestureRecognizer.WithDefault by lazy {
    as_156099775()
  }


  private val __544125779_Interface: IGestureRecognizer2.WithDefault by lazy {
    as_544125779()
  }


  public override val __156099775_Ptr: JNAPointer? by lazy {
    __156099775_Interface.__156099775_Ptr
  }


  public override val __544125779_Ptr: JNAPointer? by lazy {
    __544125779_Interface.__544125779_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__156099775_Interface, __544125779_Interface)

  public constructor() : this(ABI.activate())

  private fun as_156099775(): IGestureRecognizer.WithDefault {
    if(pointer == NULL) {
      return(IGestureRecognizer.ABI.makeIGestureRecognizer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGestureRecognizer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGestureRecognizer.ABI.makeIGestureRecognizer(ref.value))
  }

  private fun as_544125779(): IGestureRecognizer2.WithDefault {
    if(pointer == NULL) {
      return(IGestureRecognizer2.ABI.makeIGestureRecognizer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGestureRecognizer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGestureRecognizer2.ABI.makeIGestureRecognizer2(ref.value))
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
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Input.GestureRecognizer".toHandle(),
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
