package Windows.Graphics.Printing3D

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

@ABIMarker(Printing3DFaceReductionOptions.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DFaceReductionOptions;{bbfed397-2d74-46f7-be85-99a67bbb6629})")
@WinRTByReference(brClass = Printing3DFaceReductionOptions.ByReference::class)
public class Printing3DFaceReductionOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DFaceReductionOptions.WithDefault, IWinRTObject {
  private val __529437191_Interface: IPrinting3DFaceReductionOptions.WithDefault by lazy {
    as_529437191()
  }


  public override val __529437191_Ptr: JNAPointer? by lazy {
    __529437191_Interface.__529437191_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__529437191_Interface)

  public constructor() : this(ABI.activate())

  private fun as_529437191(): IPrinting3DFaceReductionOptions.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DFaceReductionOptions.ABI.makeIPrinting3DFaceReductionOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DFaceReductionOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DFaceReductionOptions.ABI.makeIPrinting3DFaceReductionOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DFaceReductionOptions> {
    public override fun getValue() = Printing3DFaceReductionOptions(pointer.getPointer(0))

    public fun setValue(value: Printing3DFaceReductionOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DFaceReductionOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DFaceReductionOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Printing3DFaceReductionOptions {
      val address = segment.toRawLongValue()
      return Printing3DFaceReductionOptions(Pointer(address))
    }

    public override fun toNative(obj: Printing3DFaceReductionOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
