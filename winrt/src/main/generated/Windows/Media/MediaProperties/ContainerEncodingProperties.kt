package Windows.Media.MediaProperties

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

@ABIMarker(ContainerEncodingProperties.ABI::class)
@Signature("rc(Windows.Media.MediaProperties.ContainerEncodingProperties;{59ac2a57-b32a-479e-8a61-4b7f2e9e7ea0})")
@WinRTByReference(brClass = ContainerEncodingProperties.ByReference::class)
public class ContainerEncodingProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContainerEncodingProperties.WithDefault,
    IMediaEncodingProperties.WithDefault, IContainerEncodingProperties2.WithDefault, IWinRTObject {
  private val __897052448_Interface: IContainerEncodingProperties.WithDefault by lazy {
    as_897052448()
  }


  private val __1294923267_Interface: IMediaEncodingProperties.WithDefault by lazy {
    as_1294923267()
  }


  private val __2038822062_Interface: IContainerEncodingProperties2.WithDefault by lazy {
    as_2038822062()
  }


  public override val __897052448_Ptr: JNAPointer? by lazy {
    __897052448_Interface.__897052448_Ptr
  }


  public override val __1294923267_Ptr: JNAPointer? by lazy {
    __1294923267_Interface.__1294923267_Ptr
  }


  public override val __2038822062_Ptr: JNAPointer? by lazy {
    __2038822062_Interface.__2038822062_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__897052448_Interface, __1294923267_Interface, __2038822062_Interface)

  public constructor() : this(ABI.activate())

  private fun as_897052448(): IContainerEncodingProperties.WithDefault {
    if(pointer == NULL) {
      return(IContainerEncodingProperties.ABI.makeIContainerEncodingProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContainerEncodingProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContainerEncodingProperties.ABI.makeIContainerEncodingProperties(ref.value))
  }

  private fun as_1294923267(): IMediaEncodingProperties.WithDefault {
    if(pointer == NULL) {
      return(IMediaEncodingProperties.ABI.makeIMediaEncodingProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaEncodingProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaEncodingProperties.ABI.makeIMediaEncodingProperties(ref.value))
  }

  private fun as_2038822062(): IContainerEncodingProperties2.WithDefault {
    if(pointer == NULL) {
      return(IContainerEncodingProperties2.ABI.makeIContainerEncodingProperties2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContainerEncodingProperties2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContainerEncodingProperties2.ABI.makeIContainerEncodingProperties2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContainerEncodingProperties> {
    public override fun getValue() = ContainerEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: ContainerEncodingProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContainerEncodingProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.ContainerEncodingProperties".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ContainerEncodingProperties {
      val address = segment.toRawLongValue()
      return ContainerEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: ContainerEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
