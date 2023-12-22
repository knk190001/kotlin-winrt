package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IElementFactoryRecycleArgsFactory.ABI.IID
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

@ABIMarker(ElementFactoryRecycleArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.ElementFactoryRecycleArgs;{46e444f7-05d3-5c5e-9b7a-5541f63e4ef9})")
@WinRTByReference(brClass = ElementFactoryRecycleArgs.ByReference::class)
public open class ElementFactoryRecycleArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IElementFactoryRecycleArgs.WithDefault, IWinRTObject {
  private val __404919205_Interface: IElementFactoryRecycleArgs.WithDefault by lazy {
    as_404919205()
  }


  public override val __404919205_Ptr: JNAPointer? by lazy {
    __404919205_Interface.__404919205_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__404919205_Interface)

  public constructor() : this(ABI.activate())

  private fun as_404919205(): IElementFactoryRecycleArgs.WithDefault {
    if(pointer == NULL) {
      return(IElementFactoryRecycleArgs.ABI.makeIElementFactoryRecycleArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IElementFactoryRecycleArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IElementFactoryRecycleArgs.ABI.makeIElementFactoryRecycleArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ElementFactoryRecycleArgs> {
    public override fun getValue() = ElementFactoryRecycleArgs(pointer.getPointer(0))

    public fun setValue(value: ElementFactoryRecycleArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ElementFactoryRecycleArgs, MemoryAddress> {
    public val IElementFactoryRecycleArgsFactory_Instance: IElementFactoryRecycleArgsFactory by
        lazy {
      createIElementFactoryRecycleArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIElementFactoryRecycleArgsFactory(): IElementFactoryRecycleArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.ElementFactoryRecycleArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IElementFactoryRecycleArgsFactory.ABI.makeIElementFactoryRecycleArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IElementFactoryRecycleArgsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ElementFactoryRecycleArgs {
      val address = segment.toRawLongValue()
      return ElementFactoryRecycleArgs(Pointer(address))
    }

    public override fun toNative(obj: ElementFactoryRecycleArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
