package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(KeySpline.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.KeySpline;{77a163bb-d5ca-4a32-ba0b-7dff988e58a0})")
@WinRTByReference(brClass = KeySpline.ByReference::class)
public class KeySpline(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IKeySpline.WithDefault, IWinRTObject {
  private val __1272188982_Interface: IKeySpline.WithDefault by lazy {
    as_1272188982()
  }


  public override val __1272188982_Ptr: JNAPointer? by lazy {
    __1272188982_Interface.__1272188982_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1272188982_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1272188982(): IKeySpline.WithDefault {
    if(pointer == NULL) {
      return(IKeySpline.ABI.makeIKeySpline(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeySpline>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeySpline.ABI.makeIKeySpline(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<KeySpline> {
    public override fun getValue() = KeySpline(pointer.getPointer(0))

    public fun setValue(value: KeySpline): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeySpline, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.KeySpline".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): KeySpline {
      val address = segment.toRawLongValue()
      return KeySpline(Pointer(address))
    }

    public override fun toNative(obj: KeySpline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
