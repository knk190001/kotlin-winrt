package Windows.Devices.Printers

import Windows.Devices.Printers.IIppResolutionFactory.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(IppResolution.ABI::class)
@Signature("rc(Windows.Devices.Printers.IppResolution;{cb493f86-6bf3-56f5-86ce-263d08aead63})")
@WinRTByReference(brClass = IppResolution.ByReference::class)
public class IppResolution(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIppResolution.WithDefault, IWinRTObject {
  private val __1475860769_Interface: IIppResolution.WithDefault by lazy {
    as_1475860769()
  }


  public override val __1475860769_Ptr: JNAPointer? by lazy {
    __1475860769_Interface.__1475860769_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1475860769_Interface)

  public constructor(
    width: Int,
    height: Int,
    unit: IppResolutionUnit
  ) : this(ABI.activate(width, height, unit))

  private fun as_1475860769(): IIppResolution.WithDefault {
    if(pointer == NULL) {
      return(IIppResolution.ABI.makeIIppResolution(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIppResolution>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIppResolution.ABI.makeIIppResolution(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IppResolution>
      {
    public override fun getValue() = IppResolution(pointer.getPointer(0))

    public fun setValue(value: IppResolution): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IppResolution, MemoryAddress> {
    public val IIppResolutionFactory_Instance: IIppResolutionFactory by lazy {
      createIIppResolutionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIppResolutionFactory(): IIppResolutionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Printers.IppResolution".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IIppResolutionFactory.ABI.makeIIppResolutionFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      width: Int,
      height: Int,
      unit: IppResolutionUnit
    ): JNAPointer? = IIppResolutionFactory_Instance.CreateInstance(width, height, unit)?.pointer

    public override fun fromNative(segment: MemoryAddress): IppResolution {
      val address = segment.toRawLongValue()
      return IppResolution(Pointer(address))
    }

    public override fun toNative(obj: IppResolution): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
