package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IElementFactoryGetArgsFactory.ABI.IID
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

@ABIMarker(ElementFactoryGetArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.ElementFactoryGetArgs;{b7017d68-ec9e-5435-b078-be6f906f0953})")
@WinRTByReference(brClass = ElementFactoryGetArgs.ByReference::class)
public open class ElementFactoryGetArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IElementFactoryGetArgs.WithDefault, IWinRTObject {
  private val __13218530_Interface: IElementFactoryGetArgs.WithDefault by lazy {
    as_13218530()
  }


  public override val __13218530_Ptr: JNAPointer? by lazy {
    __13218530_Interface.__13218530_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__13218530_Interface)

  public constructor() : this(ABI.activate())

  private fun as_13218530(): IElementFactoryGetArgs.WithDefault {
    if(pointer == NULL) {
      return(IElementFactoryGetArgs.ABI.makeIElementFactoryGetArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IElementFactoryGetArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IElementFactoryGetArgs.ABI.makeIElementFactoryGetArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ElementFactoryGetArgs> {
    public override fun getValue() = ElementFactoryGetArgs(pointer.getPointer(0))

    public fun setValue(value: ElementFactoryGetArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ElementFactoryGetArgs, MemoryAddress> {
    public val IElementFactoryGetArgsFactory_Instance: IElementFactoryGetArgsFactory by lazy {
      createIElementFactoryGetArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIElementFactoryGetArgsFactory(): IElementFactoryGetArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.ElementFactoryGetArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IElementFactoryGetArgsFactory.ABI.makeIElementFactoryGetArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IElementFactoryGetArgsFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ElementFactoryGetArgs {
      val address = segment.toRawLongValue()
      return ElementFactoryGetArgs(Pointer(address))
    }

    public override fun toNative(obj: ElementFactoryGetArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
