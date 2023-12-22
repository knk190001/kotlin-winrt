package Windows.Media.Core

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

@ABIMarker(CodecQuery.ABI::class)
@Signature("rc(Windows.Media.Core.CodecQuery;{222a953a-af61-4e04-808a-a4634e2f3ac4})")
@WinRTByReference(brClass = CodecQuery.ByReference::class)
public class CodecQuery(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICodecQuery.WithDefault, IWinRTObject {
  private val __588134681_Interface: ICodecQuery.WithDefault by lazy {
    as_588134681()
  }


  public override val __588134681_Ptr: JNAPointer? by lazy {
    __588134681_Interface.__588134681_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__588134681_Interface)

  public constructor() : this(ABI.activate())

  private fun as_588134681(): ICodecQuery.WithDefault {
    if(pointer == NULL) {
      return(ICodecQuery.ABI.makeICodecQuery(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICodecQuery>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICodecQuery.ABI.makeICodecQuery(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CodecQuery> {
    public override fun getValue() = CodecQuery(pointer.getPointer(0))

    public fun setValue(value: CodecQuery): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CodecQuery, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Core.CodecQuery".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): CodecQuery {
      val address = segment.toRawLongValue()
      return CodecQuery(Pointer(address))
    }

    public override fun toNative(obj: CodecQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
