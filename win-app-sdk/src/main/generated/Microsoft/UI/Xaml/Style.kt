package Microsoft.UI.Xaml

import Windows.UI.Xaml.Interop.TypeName
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

@ABIMarker(Style.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Style;{65e1d164-572f-5b0e-a80f-9c02441fac49})")
@WinRTByReference(brClass = Style.ByReference::class)
public class Style(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IStyle.WithDefault, IWinRTObject {
  private val __2101049802_Interface: IStyle.WithDefault by lazy {
    as_2101049802()
  }


  public override val __2101049802_Ptr: JNAPointer? by lazy {
    __2101049802_Interface.__2101049802_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2101049802_Interface)

  public constructor() : this(ABI.activate())

  public constructor(targetType: TypeName) : this(ABI.activate(targetType))

  private fun as_2101049802(): IStyle.WithDefault {
    if(pointer == NULL) {
      return(IStyle.ABI.makeIStyle(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStyle>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStyle.ABI.makeIStyle(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Style> {
    public override fun getValue() = Style(pointer.getPointer(0))

    public fun setValue(value: Style): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Style, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IStyleFactory_Instance: IStyleFactory by lazy {
      createIStyleFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Style".toHandle(), refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIStyleFactory(): IStyleFactory {
      val refiid = Guid.REFIID(IStyleFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Style".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStyleFactory.ABI.makeIStyleFactory(factoryActivatorPtr.value))
    }

    public fun activate(targetType: TypeName): JNAPointer? =
        IStyleFactory_Instance.CreateInstance(targetType)?.pointer

    public override fun fromNative(segment: MemoryAddress): Style {
      val address = segment.toRawLongValue()
      return Style(Pointer(address))
    }

    public override fun toNative(obj: Style): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
