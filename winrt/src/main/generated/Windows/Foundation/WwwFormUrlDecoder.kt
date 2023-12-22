package Windows.Foundation

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IWwwFormUrlDecoderRuntimeClassFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(WwwFormUrlDecoder.ABI::class)
@Signature("rc(Windows.Foundation.WwwFormUrlDecoder;{d45a0451-f225-4542-9296-0e1df5d254df})")
@WinRTByReference(brClass = WwwFormUrlDecoder.ByReference::class)
public class WwwFormUrlDecoder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWwwFormUrlDecoderRuntimeClass.WithDefault,
    IVectorView<IWwwFormUrlDecoderEntry?>, IIterable<IWwwFormUrlDecoderEntry?>, IWinRTObject {
  private val __1047768379_Interface: IWwwFormUrlDecoderRuntimeClass.WithDefault by lazy {
    as_1047768379()
  }


  private val __970637876_Interface: IVectorView<IWwwFormUrlDecoderEntry?> by lazy {
    as_970637876()
  }


  private val __1449643190_Interface: IIterable<IWwwFormUrlDecoderEntry?> by lazy {
    as_1449643190()
  }


  public override val __970637876_Type: KType = typeOf<IVectorView<IWwwFormUrlDecoderEntry?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IWwwFormUrlDecoderEntry?>>()

  public override val __1047768379_Ptr: JNAPointer? by lazy {
    __1047768379_Interface.__1047768379_Ptr
  }


  public override val __970637876_Ptr: JNAPointer? by lazy {
    __970637876_Interface.__970637876_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1047768379_Interface, __970637876_Interface, __1449643190_Interface)

  public constructor(query: String) : this(ABI.activate(query))

  private fun as_1047768379(): IWwwFormUrlDecoderRuntimeClass.WithDefault {
    if(pointer == NULL) {
      return(IWwwFormUrlDecoderRuntimeClass.ABI.makeIWwwFormUrlDecoderRuntimeClass(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWwwFormUrlDecoderRuntimeClass>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWwwFormUrlDecoderRuntimeClass.ABI.makeIWwwFormUrlDecoderRuntimeClass(ref.value))
  }

  private fun as_970637876(): IVectorView<IWwwFormUrlDecoderEntry?> {
    if(pointer == NULL) {
      return(IVectorView.ABI.makeIVectorView<IWwwFormUrlDecoderEntry?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVectorView<IWwwFormUrlDecoderEntry?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView.ABI.makeIVectorView<IWwwFormUrlDecoderEntry?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IWwwFormUrlDecoderEntry?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IWwwFormUrlDecoderEntry?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IWwwFormUrlDecoderEntry?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IWwwFormUrlDecoderEntry?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WwwFormUrlDecoder> {
    public override fun getValue() = WwwFormUrlDecoder(pointer.getPointer(0))

    public fun setValue(value: WwwFormUrlDecoder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WwwFormUrlDecoder, MemoryAddress> {
    public val IWwwFormUrlDecoderRuntimeClassFactory_Instance: IWwwFormUrlDecoderRuntimeClassFactory
        by lazy {
      createIWwwFormUrlDecoderRuntimeClassFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWwwFormUrlDecoderRuntimeClassFactory():
        IWwwFormUrlDecoderRuntimeClassFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.WwwFormUrlDecoder".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWwwFormUrlDecoderRuntimeClassFactory.ABI.makeIWwwFormUrlDecoderRuntimeClassFactory(factoryActivatorPtr.value))
    }

    public fun activate(query: String): JNAPointer? =
        IWwwFormUrlDecoderRuntimeClassFactory_Instance.CreateWwwFormUrlDecoder(query)?.pointer

    public override fun fromNative(segment: MemoryAddress): WwwFormUrlDecoder {
      val address = segment.toRawLongValue()
      return WwwFormUrlDecoder(Pointer(address))
    }

    public override fun toNative(obj: WwwFormUrlDecoder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
