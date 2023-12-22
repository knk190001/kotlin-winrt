package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAnnotatedScrollBarLabelFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AnnotatedScrollBarLabel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AnnotatedScrollBarLabel;{238ac07f-59fb-574f-bf5c-61c44ab386dc})")
@WinRTByReference(brClass = AnnotatedScrollBarLabel.ByReference::class)
public class AnnotatedScrollBarLabel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAnnotatedScrollBarLabel.WithDefault, IWinRTObject {
  private val __1942580833_Interface: IAnnotatedScrollBarLabel.WithDefault by lazy {
    as_1942580833()
  }


  public override val __1942580833_Ptr: JNAPointer? by lazy {
    __1942580833_Interface.__1942580833_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1942580833_Interface)

  public constructor(content: IUnknown, scrollOffset: Double) : this(ABI.activate(content,
      scrollOffset))

  private fun as_1942580833(): IAnnotatedScrollBarLabel.WithDefault {
    if(pointer == NULL) {
      return(IAnnotatedScrollBarLabel.ABI.makeIAnnotatedScrollBarLabel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnnotatedScrollBarLabel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnnotatedScrollBarLabel.ABI.makeIAnnotatedScrollBarLabel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnnotatedScrollBarLabel> {
    public override fun getValue() = AnnotatedScrollBarLabel(pointer.getPointer(0))

    public fun setValue(value: AnnotatedScrollBarLabel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnnotatedScrollBarLabel, MemoryAddress> {
    public val IAnnotatedScrollBarLabelFactory_Instance: IAnnotatedScrollBarLabelFactory by lazy {
      createIAnnotatedScrollBarLabelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnnotatedScrollBarLabelFactory(): IAnnotatedScrollBarLabelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnnotatedScrollBarLabel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAnnotatedScrollBarLabelFactory.ABI.makeIAnnotatedScrollBarLabelFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: IUnknown, scrollOffset: Double): JNAPointer? =
        IAnnotatedScrollBarLabelFactory_Instance.CreateInstance(content, scrollOffset)?.pointer

    public override fun fromNative(segment: MemoryAddress): AnnotatedScrollBarLabel {
      val address = segment.toRawLongValue()
      return AnnotatedScrollBarLabel(Pointer(address))
    }

    public override fun toNative(obj: AnnotatedScrollBarLabel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
