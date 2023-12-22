package Windows.Graphics.Imaging

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

@ABIMarker(BitmapTransform.ABI::class)
@Signature("rc(Windows.Graphics.Imaging.BitmapTransform;{ae755344-e268-4d35-adcf-e995d31a8d34})")
@WinRTByReference(brClass = BitmapTransform.ByReference::class)
public class BitmapTransform(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBitmapTransform.WithDefault, IWinRTObject {
  private val __513691284_Interface: IBitmapTransform.WithDefault by lazy {
    as_513691284()
  }


  public override val __513691284_Ptr: JNAPointer? by lazy {
    __513691284_Interface.__513691284_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__513691284_Interface)

  public constructor() : this(ABI.activate())

  private fun as_513691284(): IBitmapTransform.WithDefault {
    if(pointer == NULL) {
      return(IBitmapTransform.ABI.makeIBitmapTransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapTransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapTransform.ABI.makeIBitmapTransform(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BitmapTransform> {
    public override fun getValue() = BitmapTransform(pointer.getPointer(0))

    public fun setValue(value: BitmapTransform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapTransform, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Imaging.BitmapTransform".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): BitmapTransform {
      val address = segment.toRawLongValue()
      return BitmapTransform(Pointer(address))
    }

    public override fun toNative(obj: BitmapTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
