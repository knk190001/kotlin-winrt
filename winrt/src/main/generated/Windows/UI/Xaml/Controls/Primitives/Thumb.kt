package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Control
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(Thumb.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.Thumb;{e8b2b281-0d6a-45cf-b333-2402b037f099})")
@WinRTByReference(brClass = Thumb.ByReference::class)
public class Thumb(
  ptr: JNAPointer? = NULL
) : Control(ptr), IThumb.WithDefault, IWinRTObject {
  private val __1627803770_Interface: IThumb.WithDefault by lazy {
    as_1627803770()
  }


  public override val __1627803770_Ptr: JNAPointer? by lazy {
    __1627803770_Interface.__1627803770_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1627803770_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1627803770(): IThumb.WithDefault {
    if(pointer == NULL) {
      return(IThumb.ABI.makeIThumb(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IThumb>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IThumb.ABI.makeIThumb(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Thumb> {
    public override fun getValue() = Thumb(pointer.getPointer(0))

    public fun setValue(value: Thumb): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Thumb, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IThumbStatics_Instance: IThumbStatics by lazy {
      createIThumbStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.Thumb".toHandle(),
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

    public fun createIThumbStatics(): IThumbStatics {
      val refiid = Guid.REFIID(IThumbStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.Thumb".toHandle(),refiid,interfacePtr)
      val result = IThumbStatics.ABI.makeIThumbStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Thumb {
      val address = segment.toRawLongValue()
      return Thumb(Pointer(address))
    }

    public override fun toNative(obj: Thumb): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsDraggingProperty() = ABI.IThumbStatics_Instance.get_IsDraggingProperty()
  }
}
