package Windows.UI.Xaml.Markup

import Windows.UI.Xaml.Markup.IMarkupExtensionFactory.ABI.IID
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MarkupExtension.ABI::class)
@Signature("rc(Windows.UI.Xaml.Markup.MarkupExtension;{1ee3416d-562b-486e-9ee5-0f0cbcc8048c})")
@WinRTByReference(brClass = MarkupExtension.ByReference::class)
public open class MarkupExtension(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMarkupExtension.WithDefault, IMarkupExtensionOverrides.WithDefault,
    IWinRTObject {
  private val __476673907_Interface: IMarkupExtension.WithDefault by lazy {
    as_476673907()
  }


  private val __1602993126_Interface: IMarkupExtensionOverrides.WithDefault by lazy {
    as_1602993126()
  }


  public override val __476673907_Ptr: JNAPointer? by lazy {
    __476673907_Interface.__476673907_Ptr
  }


  public override val __1602993126_Ptr: JNAPointer? by lazy {
    __1602993126_Interface.__1602993126_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__476673907_Interface, __1602993126_Interface)

  public constructor() : this(ABI.activate())

  private fun as_476673907(): IMarkupExtension.WithDefault {
    if(pointer == NULL) {
      return(IMarkupExtension.ABI.makeIMarkupExtension(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMarkupExtension>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMarkupExtension.ABI.makeIMarkupExtension(ref.value))
  }

  private fun as_1602993126(): IMarkupExtensionOverrides.WithDefault {
    if(pointer == NULL) {
      return(IMarkupExtensionOverrides.ABI.makeIMarkupExtensionOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMarkupExtensionOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMarkupExtensionOverrides.ABI.makeIMarkupExtensionOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MarkupExtension> {
    public override fun getValue() = MarkupExtension(pointer.getPointer(0))

    public fun setValue(value: MarkupExtension): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MarkupExtension, MemoryAddress> {
    public val IMarkupExtensionFactory_Instance: IMarkupExtensionFactory by lazy {
      createIMarkupExtensionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMarkupExtensionFactory(): IMarkupExtensionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Markup.MarkupExtension".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMarkupExtensionFactory.ABI.makeIMarkupExtensionFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMarkupExtensionFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MarkupExtension {
      val address = segment.toRawLongValue()
      return MarkupExtension(Pointer(address))
    }

    public override fun toNative(obj: MarkupExtension): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
