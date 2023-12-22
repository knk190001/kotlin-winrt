package Windows.UI.Xaml.Media

import Windows.UI.Xaml.Media.IRevealBorderBrushFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(RevealBorderBrush.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.RevealBorderBrush;{060ba115-c542-483c-8202-5f03331866c9})")
@WinRTByReference(brClass = RevealBorderBrush.ByReference::class)
public open class RevealBorderBrush(
  ptr: JNAPointer? = NULL
) : RevealBrush(ptr), IRevealBorderBrush.WithDefault, IWinRTObject {
  private val __778542619_Interface: IRevealBorderBrush.WithDefault by lazy {
    as_778542619()
  }


  public override val __778542619_Ptr: JNAPointer? by lazy {
    __778542619_Interface.__778542619_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__778542619_Interface)

  public constructor() : this(ABI.activate())

  private fun as_778542619(): IRevealBorderBrush.WithDefault {
    if(pointer == NULL) {
      return(IRevealBorderBrush.ABI.makeIRevealBorderBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRevealBorderBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRevealBorderBrush.ABI.makeIRevealBorderBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RevealBorderBrush> {
    public override fun getValue() = RevealBorderBrush(pointer.getPointer(0))

    public fun setValue(value: RevealBorderBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RevealBorderBrush, MemoryAddress> {
    public val IRevealBorderBrushFactory_Instance: IRevealBorderBrushFactory by lazy {
      createIRevealBorderBrushFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRevealBorderBrushFactory(): IRevealBorderBrushFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.RevealBorderBrush".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRevealBorderBrushFactory.ABI.makeIRevealBorderBrushFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRevealBorderBrushFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RevealBorderBrush {
      val address = segment.toRawLongValue()
      return RevealBorderBrush(Pointer(address))
    }

    public override fun toNative(obj: RevealBorderBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
